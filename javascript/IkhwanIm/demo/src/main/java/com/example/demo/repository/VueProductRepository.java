package com.example.demo.repository;

import com.example.demo.entity.Product;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
public class VueProductRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void create(Product product) throws Exception {
        String query = "insert into vueproduct (product_name, description, producer, price) values (?, ?, ?, ?)";

        jdbcTemplate.update(query, product.getProductName(), product.getDescription(), product.getProducer(), product.getPrice());
    }

    public List<Product> list() throws Exception {
        // RowMapper를 통해 얻은 행을 하나씩 List에 집어넣으니
        // results엔 DB에서 얻어온 행 정보들이 들어있다.
        List<Product> results = jdbcTemplate.query(
                "select product_no, product_name, description, producer, price, reg_date from vueproduct " +
                        "where product_no > 0 order by product_no desc",
                // Row: 행
                // 여러개의 Column(열)들이 행 1개에 포함되어 있음
                // 여러 열들을 얻어와서 행으로 맵핑하는 작업을 수행함
                new RowMapper<Product>() {
                    @SneakyThrows
                    @Override
                    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Product product = new Product();

                        product.setProductNo(rs.getInt("board_no"));
                        product.setProductName(rs.getString("product_name"));
                        product.setDescription(rs.getString("description"));
                        product.setProducer(rs.getString("producer"));
                        product.setPrice(rs.getInt("price"));

                        //SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
                        //board.setRegDate(sdf.parse(rs.getDate("reg_date") + " " + rs.getTime("reg_date")));

                        product.setRegDate(rs.getDate("reg_date"));

                        return product;
                    }
                }
        );

        return results;
    }
    public Product read (Integer productNo) throws Exception {
        List<Product> results = jdbcTemplate.query(
                "select product_no, product_name, discription, producer, price, reg_date from vueproduct where product_no = ?",
                new RowMapper<Product>() {
                    @Override
                    public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
                        Product product = new Product();

                        product.setProductNo(rs.getInt("product_no"));
                        product.setProductName(rs.getString("product_name"));
                        product.setDescription(rs.getString("description"));
                        product.setProducer(rs.getString("producer"));
                        product.setPrice(rs.getInt("price"));
                        product.setProductNo(rs.getInt("product_no"));
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
        String query = "update vueproduct set product_name = ?, description = ?, producer = ?, price = ? where porduct_no = ?";
        jdbcTemplate.update(query, product.getProductName(), product.getDescription(), product.getProducer(), product.getPrice());
    }
}