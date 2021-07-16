package com.example.demo.repository;

import com.example.demo.entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class VueMemberRepository {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void create (Member member) {
        String query = "insert into vuemember (name, id, pw) values (?, ?, ?)";

        jdbcTemplate.update(query, member.getName(), member.getId(), member.getPw());
    }
}
