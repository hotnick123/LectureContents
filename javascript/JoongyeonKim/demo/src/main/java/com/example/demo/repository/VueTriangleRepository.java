package com.example.demo.repository;

import com.example.demo.entity.Product;
import com.example.demo.entity.Triangle;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.List;

@Slf4j
@Repository
public class VueTriangleRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void create(Triangle triangle) {

        String query = "insert into vuetriangle (bottomline, height, answer) values (?, ?, ?)";



        jdbcTemplate.update(query, triangle.getBottomline(), triangle.getHeight(), triangle.getAnswer());
    }
}
