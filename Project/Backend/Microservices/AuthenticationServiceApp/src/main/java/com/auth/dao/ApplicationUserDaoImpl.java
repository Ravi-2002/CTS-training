/*
 * package com.auth.dao;
 * 
 * import java.sql.PreparedStatement; import java.sql.ResultSet; import
 * java.sql.SQLException;
 * 
 * import org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.dao.DataAccessException; import
 * org.springframework.jdbc.core.JdbcTemplate; import
 * org.springframework.jdbc.core.PreparedStatementSetter; import
 * org.springframework.jdbc.core.ResultSetExtractor; import
 * org.springframework.stereotype.Repository;
 * 
 * import com.auth.models.ApplicationUser;
 * 
 * @Repository public class ApplicationUserDaoImpl implements ApplicationUserDao
 * {
 * 
 * @Autowired private JdbcTemplate jdbcTemplate;
 * 
 * public ApplicationUser find(String username) { PreparedStatementSetter setter
 * = new PreparedStatementSetter() {
 * 
 * @Override public void setValues(PreparedStatement ps) throws SQLException {
 * // TODO Auto-generated method stub ps.setString(1, username); } };
 * 
 * return jdbcTemplate.query("select * from ApplicationUser where username=?",
 * setter, new ResultSetExtractor<ApplicationUser>() {
 * 
 * @Override public ApplicationUser extractData(ResultSet rs) throws
 * SQLException, DataAccessException {
 * 
 * ApplicationUser c = null; if (rs.next()) { c=new ApplicationUser();
 * c.setUserId(rs.getInt(1)); c.setUsername(rs.getString(2));
 * c.setPassword(rs.getString(3));
 * 
 * } return c; } });
 * 
 * }
 * 
 * }
 */