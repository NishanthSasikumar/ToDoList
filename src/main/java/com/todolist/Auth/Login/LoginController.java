package com.todolist.Auth.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {
	
	@Autowired
	LoginService loginSer;
	
	@PostMapping("/Login")
	public String Check(@RequestParam("Email") String Email,@RequestParam("Password") String Password,HttpSession session)
	{
		String Result = loginSer.checkAuth(Email,Password);
		session.setAttribute("userId",Email);
		session.setAttribute("Role","User");
		return Result;
	}
}
