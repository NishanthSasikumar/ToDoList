package com.todolist.Auth.Login;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class LoginRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public boolean checkEmail(String Email)
	{
		String sql="select Email from authenTable where Email=?";
		List<String> email=jdbcTemplate.query(sql,(rs,rowNum)->rs.getString("Email"),Email);
		return !email.isEmpty();
	}
	public String checkPassWord(String Email)
	{
		String sql="select PassWord from AuthenTable where Email=?";
		List<String> PW=jdbcTemplate.query(sql,(rs,rowNum)->rs.getString("Password"),Email);
		return PW.get(0);
	}
}
