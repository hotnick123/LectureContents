package com.example.Quiz.repository;

import com.example.Quiz.entity.Monster;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Slf4j
@Repository
public class MonsterRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void create (Monster monster) throws Exception {
        String query = "insert into monster (name, hp, exp, money) values (?, ?, ?, ?)";

        jdbcTemplate.update(query, monster.getName(), monster.getHp(), monster.getExp(), monster.getMoney());
    }
}
