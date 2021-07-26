package com.example.jswithspring.repository;

import com.example.jswithspring.entity.Dungeon;
import com.example.jswithspring.entity.Student;
import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Slf4j
@Repository
public class VueStudentRepository {

    static final int STUDENT_NUM = 3;

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Student> randomList() throws Exception {

        int cnt = 0;
        int[] randArr = new int[STUDENT_NUM];

        List<Student> tmp;

        int max = jdbcTemplate.queryForObject(
                "select count(1) from vuestudent",
                Integer.class
        );

        for(int i = 0; i < STUDENT_NUM; i++) {
            randArr[i] = (int) (Math.random() * max) + 1;
        }

        List<Student> results = new ArrayList<Student>();

        for (int i = 0; i < STUDENT_NUM; i++) {
            tmp = jdbcTemplate.query(
                    "select student_no, name, grade, reg_date " +
                            "from vuestudent where student_no = ?",

                    new RowMapper<Student>() {
                        @SneakyThrows
                        @Override
                        public Student mapRow(ResultSet rs, int rowNum) throws SQLException {

                            log.info("rowNum: " + rowNum);

                            Student student = new Student();

                            student.setStudentNo(rs.getInt("student_no"));
                            student.setName(rs.getString("name"));
                            student.setGrade(rs.getFloat("grade"));
                            student.setRegDate(rs.getDate("reg_date"));

                            return student;
                        }
                    }, randArr[i]
            );

            results.add(tmp.get(0));
        }

        return results;
    }
}