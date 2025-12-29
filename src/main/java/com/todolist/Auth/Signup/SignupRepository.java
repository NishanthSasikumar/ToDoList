package com.todolist.Auth.Signup;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class SignupRepository {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public void storeRepo(String Email,String passWord)
	{
		String sql="insert into authenTable (Email,passWord) values(?,?)";
		jdbcTemplate.update(sql,Email,passWord);
	}
	public Boolean checkEmailRepo(String Email)
	{
		String sql="select Email from authenTable where Email= ?";
		List<String> email=jdbcTemplate.query(sql, (rs,rowNum)-> rs.getString("Email"),Email);
		return !email.isEmpty();
	}
	
}
