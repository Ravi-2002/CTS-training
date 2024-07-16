/*
 * package com.product.dao;
 * 
 * import java.sql.ResultSet; import java.sql.SQLException; import
 * java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.jdbc.core.JdbcTemplate; import
 * org.springframework.jdbc.core.RowMapper; import
 * org.springframework.stereotype.Component;
 * 
 * import com.product.models.Product;
 * 
 * @Component public class ProductDaoImpl implements ProductDao{
 * 
 * @Autowired private JdbcTemplate jdbcTemplate;
 * 
 * @Override public List<Product> getproducts() { // TODO Auto-generated method
 * stub return jdbcTemplate.query("select * from product",new
 * RowMapper<Product>() {
 * 
 * @Override public Product mapRow(ResultSet rs, int rowNum) throws SQLException
 * { // TODO Auto-generated method stub Product p=new Product();
 * p.setProductId(rs.getInt(1)); p.setProductName(rs.getString(2));
 * p.setProductPrice(rs.getInt(3)); p.setProductDescription(rs.getString(4));
 * p.setProductImageUrl(rs.getString(5));
 * 
 * return p; }
 * 
 * 
 * }); }
 * 
 * }
 */