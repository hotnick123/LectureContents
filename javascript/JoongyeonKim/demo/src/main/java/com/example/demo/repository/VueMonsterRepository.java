package com.example.demo.repository;

import com.example.demo.entity.Monster;
import com.example.demo.entity.Product;
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
public class VueMonsterRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void create(Monster monster) {

        String query = "insert into vuemonster (name, hp, atk) values (?, ?, ?)";

        jdbcTemplate.update(query, monster.getMonsterName(), monster.getHp(), monster.getAtk());
    }

    public List<Monster> list() throws Exception {

        List<Monster> results = jdbcTemplate.query(
                "select monster_no, monster_name, hp, atk, reg_date from vuemonster " +
                        "where monster_no > 0 order by monster_no desc",

                new RowMapper<Monster>() {
                    @SneakyThrows
                    @Override
                    public Monster mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Monster monster = new Monster();

                        monster.setMonsterNo(rs.getInt("monster_no"));
                        monster.setMonsterName(rs.getString("monster_name"));
                        monster.setHp(rs.getInt("hp"));
                        monster.setAtk(rs.getInt("atk"));

                        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

                        monster.setRegDate(sdf.parse(rs.getDate("reg_date") + " " + rs.getTime("reg_date")));

                        return monster;
                    }
                }
        );
        return results;
    }
    /*
    public Product read (Integer productNo) throws Exception {
        List<Product> results = jdbcTemplate.query(
                "select product_no, name, price, description, writer, reg_date from vueproduct where product_no = ?",
                new RowMapper<Product>() {
                    @Override
                    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Product product = new Product();

                        product.setProductNo(rs.getInt("product_no"));
                        product.setName(rs.getString("name"));
                        product.setPrice(rs.getInt("price"));
                        product.setDescription(rs.getString("description"));
                        product.setWriter(rs.getString("writer"));
                        product.setRegDate(rs.getDate("reg_date"));

                        return product;
                    }
                }, productNo);

        return results.isEmpty() ? null : results.get(0);
    }

    public void delete(Integer productNo) throws Exception {
        String query = "delete from vueproduct where product_no = ?";

        jdbcTemplate.update(query, productNo);
    }

    public void update(Product product) throws Exception {
        String query = "update vueproduct set name = ?, price = ?, description= ? where product_no = ?";

        jdbcTemplate.update(query, product.getName(), product.getPrice(), product.getDescription(), product.getProductNo());
    }

    */
}
