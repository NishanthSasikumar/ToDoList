package com.todolist.Auth.Logout;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpSession;

@RestController
public class LogoutController {

	@Autowired
	LogoutService logoutSer;
	
	public void logOutSer(HttpSession session)
	{
		logoutSer.logOut(session);
	}
}
