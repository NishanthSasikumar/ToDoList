package com.todolist.Auth.Signup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignupService {
	
	@Autowired
	SignupRepository signupRepo;
	
	public String Store(String Email,String password,String confirmPW)
	{
		if(!password.equals(confirmPW))
			return "Password Mismatch";
		if(checkEmail(Email))
			return "Email Already Exist";
		signupRepo.storeRepo(Email, password);
		return "success";
				
	}
	public Boolean checkEmail(String Email)
	{
		return signupRepo.checkEmailRepo(Email);
	}
}
