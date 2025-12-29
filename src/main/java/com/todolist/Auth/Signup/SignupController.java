package com.todolist.Auth.Signup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SignupController {
	
	@Autowired
	SignupService signupser;
	
	@PostMapping("/Signup")
	public String handleSignup(@RequestParam("Email") String Email,@RequestParam("passWord") String passWord,@RequestParam("ConfirmPW") String confirmPW)
	{
		signupser.Store(Email,passWord,confirmPW);
		return "Saved Successfully";
	}
}
