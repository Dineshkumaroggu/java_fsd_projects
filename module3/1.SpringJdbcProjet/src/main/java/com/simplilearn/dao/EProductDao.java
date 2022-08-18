package com.simplilearn.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.simplilearn.entity.EProductEntity;

@Repository
public class EProductDao {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<EProductEntity> getAllProducts() {

		return jdbcTemplate.query("select * from productdetails", new RowMapper<EProductEntity>() {

			public EProductEntity mapRow(ResultSet rs, int rowNum) throws SQLException {

				EProductEntity obj = new EProductEntity();
				obj.setId(rs.getLong(1));
				obj.setName(rs.getString(2));
				obj.setPrice(rs.getBigDecimal(3));
				return obj;
			}

		});

	}

	public EProductEntity getProductById(long id) {
		return jdbcTemplate.query("select * from productdetails where pid=" + id,
				new ResultSetExtractor<EProductEntity>() {

					public EProductEntity extractData(ResultSet rs) throws SQLException, DataAccessException {
						// TODO Auto-generated method stub
						if (rs.next()) {
							EProductEntity obj = new EProductEntity();
							obj.setId(rs.getLong(1));
							obj.setName(rs.getString(2));
							obj.setPrice(rs.getBigDecimal(3));
							return obj;
						}
						return null;
					}
				});
	}

	
	
	public void updateProduct(long id,String name,String price) {
	    String sql = "update productdetails set pname="+"'"+name+"'"+","+"price="+price+" where pid="+id;
		jdbcTemplate.update(sql);
	
	}
}
