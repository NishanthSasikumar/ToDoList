package com.todolist.Auth.Signup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SignupService {
	
	@Autowired
	SignupRepository signupRepo;
	
	public void Store(String Email,String password,String confirmPW)
	{
		if(!password.equals(confirmPW))
			throw error;
		if(checkEmail(Email))
			throw error
		signupRepo.storeRepo(Email, password);;
				
	}
	public Boolean checkEmail(String Email)
	{
		return signupRepo.checkEmailRepo(Email);
	}
}
