package com.example.cholongtest.repository;

import com.example.cholongtest.entity.Board;
import com.example.cholongtest.entity.Monster;
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
        String query = "insert into vuemonster (name, hp, exp) values (?, ?, ?)";
        jdbcTemplate.update(query, monster.getName(), monster.getHp(), monster.getExp());
    }

    public List<Monster> list() throws Exception {

        List<Monster> results = jdbcTemplate.query(
                "select monster_no, name, hp, exp, reg_date from vuemonster " +
                        "where monster_no > 0 order by monster_no desc",

                new RowMapper<Monster>() {
                    @SneakyThrows
                    @Override
                    public Monster mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Monster monster = new Monster();

                        // rs.getInt()는 DB에 있는 정수형 정보를 얻어옴
                        monster.setMonsterNo(rs.getInt("monster_no"));
                        // rs.getString()은 DB에 있는 문자열 정보를 얻어옴
                        monster.setName(rs.getString("name"));
                        monster.setHp(rs.getInt("hp"));
                        monster.setExp(rs.getInt("exp"));


                        monster.setRegDate(rs.getDate("reg_date"));

                        return monster;
                    }
                }
        );

        return results;
    }

    public Monster read (Integer monster_no) throws Exception {
        List<Monster> results = jdbcTemplate.query(
                "select monster_no, name, hp, exp, reg_date from vuemonster where monster_no = ?",
                new RowMapper<Monster>() {
                    @Override
                    public Monster mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Monster monster = new Monster();

                        monster.setMonsterNo(rs.getInt("monster_no"));
                        monster.setName(rs.getString("name"));
                        monster.setHp(rs.getInt("hp"));
                        monster.setExp(rs.getInt("exp"));
                        monster.setRegDate(rs.getDate("reg_date"));

                        return monster;
                    }
                }, monster_no);

        return results.isEmpty() ? null : results.get(0);
    }

    public void delete(Integer monster_no) throws Exception {
        String query = "delete from vuemonster where monster_no = ?";

        jdbcTemplate.update(query, monster_no);
    }

    public void update(Monster monster) throws Exception {
        String query = "update vuemonster set name = ?, hp = ?, exp = ? where monster_no = ?";

        jdbcTemplate.update(query, monster.getName(), monster.getHp(), monster.getExp(), monster.getMonsterNo());
    }
}