package com.chainsys.newbornbabyhealthtrackingsystem.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.chainsys.newbornbabyhealthtrackingsystem.model.Login;
import com.chainsys.newbornbabyhealthtrackingsystem.services.LoginService;

@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;
	
	@GetMapping("/signinform")
	public String showPersonAddForm(Model model) {
		Login theLogin = new Login();
		model.addAttribute("userLogin", theLogin);
		return "/home/loginpage.jsp";
	}

	@PostMapping("addnewuserlogin")
	public String addNewUser(@Valid @ModelAttribute("userLogin") Login theUser ,Error error) {
		loginService.addUser(theUser);
		
		return "";
	}
}
