/*
 * package com.order.dao;
 * 
 * import org.springframework.jdbc.core.JdbcTemplate; import
 * org.springframework.jdbc.core.RowMapper; import
 * org.springframework.stereotype.Component;
 * 
 * import java.sql.ResultSet; import java.sql.SQLException; import
 * java.util.List;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * com.order.models.Order;
 * 
 * @Component public class OrdersDaoImpl implements OrdersDao {
 * 
 * @Autowired private JdbcTemplate jdbcTemplate;
 * 
 * @Override public boolean add(Order order) { // TODO Auto-generated method
 * stub int r = jdbcTemplate.update( "insert into orders" +
 * "(userid,deliveryaddress,orderdate,paymentmode,orderamount) " +
 * "values(?,?,?,?,?)", order.getUserid(), order.getDeliveryAddress(),
 * order.getOrderDate(), order.getPaymentMode(), order.getOrderAmount());
 * 
 * if (r > 0) return true; else return false; }
 * 
 * @Override public List<Order> getAll() { // TODO Auto-generated method stub
 * 
 * return jdbcTemplate.query("select * from orders", new RowMapper<Order>() {
 * 
 * @Override public Order mapRow(ResultSet rs, int rowNum) throws SQLException {
 * // TODO Auto-generated method stub Order o = new Order();
 * o.setOrderId(rs.getInt(1)); o.setUserid(rs.getInt(2));
 * o.setDeliveryAddress(rs.getString(3)); o.setOrderDate(rs.getDate(4));
 * o.setPaymentMode(rs.getString(5)); o.setOrderAmount(rs.getInt(6));
 * 
 * return o; } });
 * 
 * }
 * 
 * }
 */