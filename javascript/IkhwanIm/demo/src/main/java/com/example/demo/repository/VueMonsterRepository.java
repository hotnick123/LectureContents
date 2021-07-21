package com.example.demo.repository;

import com.example.demo.entity.Monster;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class VueMonsterRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void create(Monster monster) throws Exception {
        String query = "insert into vuemonster (monster_name, hp, exp, money) values (?, ?, ?, ?)";

        jdbcTemplate.update(query, monster.getMonster_name(), monster.getHp(),
                monster.getExp(), monster.getMoney());
    }


    public List<Monster> list() throws Exception {
        List<Monster> results = jdbcTemplate.query(
                "select monster_no, monster_name, hp, exp, money, reg_date from vuemonster " +
                        "where monster_no > 0 order by monster_no desc",

                new RowMapper<Monster>() {
                    @SneakyThrows
                    @Override
                    public Monster mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Monster monster = new Monster();

                        monster.setMonsterNo(rs.getInt("monster_no"));
                        monster.setMonster_name(rs.getString("monster_name"));
                        monster.setHp(rs.getInt("hp"));
                        monster.setExp(rs.getInt("exp"));
                        monster.setMoney(rs.getInt("money"));

                        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        //board.setRegDate(sdf.parse(rs.getDate("reg_date") + " " + rs.getTime("reg_date")));

                        monster.setRegDate(rs.getDate("reg_date"));

                        return monster;
                    }
                }
        );

        return results;
    }
    public Monster read (Integer monsterNo) throws Exception {
        List<Monster> results = jdbcTemplate.query(
                "select monster_no, monster_name, hp, exp, money, " +
                        "reg_date from vuemonster where monster_no = ?",
                new RowMapper<Monster>() {
                    @Override
                    public Monster mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Monster monster = new Monster();

                        monster.setMonsterNo(rs.getInt("monster_no"));
                        monster.setMonster_name(rs.getString("monster_name"));
                        monster.setHp(rs.getInt("hp"));
                        monster.setExp(rs.getInt("exp"));
                        monster.setMoney(rs.getInt("money"));
                        monster.setRegDate(rs.getDate("reg_date"));

                        return monster;
                    }
                }, monsterNo);

        return results.isEmpty() ? null : results.get(0);
    }

    public void delete(Integer productNo) throws Exception {
        String query = "delete from vuemonster where monster_no = ?";

        jdbcTemplate.update(query, productNo);
    }


    public void update(Monster monster) throws Exception {
        String query = "update vuemonster set monster_name = ?, hp = ?, exp = ?, money = ? where monster_no = ?";
        jdbcTemplate.update(query, monster.getMonster_name(), monster.getHp(), monster.getExp(), monster.getMoney(), monster.getMonsterNo());
    }
}