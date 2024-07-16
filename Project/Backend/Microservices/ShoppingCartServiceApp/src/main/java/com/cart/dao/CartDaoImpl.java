//package com.cart.dao;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.stereotype.Component;
//
//import com.cart.models.Cart;
//
//@Component
//public class CartDaoImpl implements CartDao{
//	@Autowired
//	private JdbcTemplate jdbcTemplate;
//	
//
//
//	@Override
//	public List<Cart> getAll() {
//		// TODO Auto-generated method stub
//		return jdbcTemplate.query("select * from cart",new RowMapper<Cart>() {
//
//			@Override
//			public Cart mapRow(ResultSet rs, int rowNum) throws SQLException {
//				// TODO Auto-generated method stub
//				Cart c=new Cart();
//				c.setId(rs.getInt(1));
//				c.setUserid(rs.getInt(2));
//				c.setProductId(rs.getInt(3));
//				c.setProductname(rs.getString(4));
//				c.setProductPrice(rs.getInt(5));
//				c.setQuantity(rs.getInt(6));
//				c.setSumTotal(rs.getInt(7));
//				
//				return c;
//			}
//		});
//
//	}
//
//	@Override
//	public boolean addToCart(Cart item) {
//		// TODO Auto-generated method stub
//		int r=jdbcTemplate.update("insert into cart (userid,productid,productname,productprice,quantity,sumtotal) values(?,?,?,?,?,?)",item.getUserid(),item.getProductId(),item.getProductname(),item.getProductPrice(),item.getQuantity(),item.getSumTotal());
//		
//		if(r>0) return true;
//		else
//		return false;
//	}
//
//	@Override
//	public boolean delete(int id) {
//		// TODO Auto-generated method stub
//		int r= jdbcTemplate.update("delete from cart where id=?",id);
//		if(r>0)
//		return true;
//		else return false;
//	}
//	
//	
//	@Override
//	public boolean deleteAll() {
//		// TODO Auto-generated method stub
//		int r= jdbcTemplate.update("delete from cart");
//		if(r>0)
//		return true;
//		else return false;
//	}
//}
