package com.todolist.Auth.Signup;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import jakarta.servlet.http.HttpSession;

@Controller
public class SignupController {
	
	@Autowired
	SignupService signupser;
	
	@PostMapping("/Signup")
	public String handleSignup(@RequestParam("Email") String Email,@RequestParam("passWord") String passWord,@RequestParam("ConfirmPW") String confirmPW,HttpSession session,RedirectAttributes ra)
	{
		String ans=signupser.Store(Email,passWord,confirmPW);
		session.setAttribute("userId",Email);
		session.setAttribute("Role","User");
		ra.addFlashAttribute("Success",ans);
		return "redirect:/Today";
	}

}
