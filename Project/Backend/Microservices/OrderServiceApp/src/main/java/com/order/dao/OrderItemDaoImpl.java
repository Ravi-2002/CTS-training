/*
 * package com.order.dao;
 * 
 * import org.springframework.jdbc.core.JdbcTemplate; import
 * org.springframework.stereotype.Component;
 * 
 * import com.order.models.OrderItem;
 * 
 * import org.springframework.beans.factory.annotation.Autowired;
 * 
 * @Component public class OrderItemDaoImpl implements OrderItemDao{
 * 
 * @Autowired private JdbcTemplate jdbcTemplate;
 * 
 * @Override public boolean addItem(OrderItem item) { // TODO Auto-generated
 * method stub int r= jdbcTemplate.
 * update("insert into orderitem (orderid,productid,productname,productprice,quantity,subtotal) values(?,?,?,?,?,?)"
 * , item.getOrderId(),item.getProductid(),item.getProductName(),
 * item.getProductPrice(),item.getQuantity(),item.getSubTotal());
 * 
 * if(r>0) return true; else return false; } }
 */