package com.todolist.Auth.Login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class LoginService {

	@Autowired
	LoginRepository loginRep;
	
	public String checkAuth(String Email,String Password)
	{
		if(loginRep.checkEmail(Email))
		{
			String PW=loginRep.checkPassWord(Email);
			if(PW.equals(Password))
				return "redirect:/Today";
			else
				return "Password Mismatch";
		}
		else
			return "Please Signup";
	}
}
