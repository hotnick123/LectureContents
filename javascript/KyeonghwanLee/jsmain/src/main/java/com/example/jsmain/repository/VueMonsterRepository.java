package com.example.jsmain.repository;

import com.example.jsmain.entity.Monster;
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
        String query = "insert into vuemonster (monster_name, hp, atk, def) values (?, ?, ?, ?)";

        jdbcTemplate.update(query, monster.getMonster_name(), monster.getHp(), monster.getAtk(), monster.getDef());
    }

    public List<Monster> list() throws Exception {

        List<Monster> results = jdbcTemplate.query(
                "select monster_no, monster_name, hp, atk, def, reg_date from vuemonster " +
                        "where monster_no > 0 order by monster_no desc",

                new RowMapper<Monster>() {
                    @SneakyThrows
                    @Override
                    public Monster mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Monster monster = new Monster();

                        monster.setMonsterNo(rs.getInt("monster_no"));
                        monster.setMonster_name(rs.getString("monster_name"));
                        monster.setHp(rs.getInt("hp"));
                        monster.setAtk(rs.getInt("atk"));
                        monster.setDef((rs.getInt("def")));

                        monster.setRegDate(rs.getDate("reg_date"));

                        return monster;
                    }
                }
        );

        return results;
    }


    public void delete(Integer monsterNo) throws Exception {
        String query = "delete from vuemonster where monster_no = ?";
        jdbcTemplate.update(query, monsterNo);
    }


    public void update(Monster monster) throws Exception {
        String query = "update vuemonster set monster_name = ?, hp = ?, atk = ?, def = ? where monster_no = ?";
        jdbcTemplate.update(query, monster.getMonster_name(), monster.getHp(), monster.getAtk(), monster.getDef(), monster.getMonsterNo());
    }

}