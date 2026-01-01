package com.todolist.Auth.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;

@RestController
public class LoginController {
	
	@Autowired
	LoginService loginSer;
	
	public String Check(@RequestParam("Email") String Email,@RequestParam("Password") String Password,HttpSession session)
	{
		String Result = loginSer.checkAuth(Email,Password);
		session.setAttribute("userId",Email);
		session.setAttribute("Role","User")
		return "redirect";   //you need to learn about redirect
	}
}
