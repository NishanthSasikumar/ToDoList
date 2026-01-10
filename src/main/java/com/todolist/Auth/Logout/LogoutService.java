package com.todolist.Auth.Logout;

import org.springframework.stereotype.Service;

import jakarta.servlet.http.HttpSession;

@Service
public class LogoutService {

	public void logOut(HttpSession session)
	{
		session.invalidate();
	}
}
