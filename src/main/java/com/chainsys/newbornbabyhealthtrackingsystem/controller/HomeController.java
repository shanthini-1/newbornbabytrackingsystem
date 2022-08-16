package com.chainsys.newbornbabyhealthtrackingsystem.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.chainsys.newbornbabyhealthtrackingsystem.model.Login;
import com.chainsys.newbornbabyhealthtrackingsystem.model.Person;
import com.chainsys.newbornbabyhealthtrackingsystem.services.LoginService;
import com.chainsys.newbornbabyhealthtrackingsystem.services.PersonServices;


public class HomeController {
	@Autowired 
	private PersonServices personServices;
	@Autowired
	private LoginService loginService;
	
	@GetMapping("/signinform")
	public String showPersonAddForm(Model model) {
		Login theLogin = new Login();
		model.addAttribute("userLogin", theLogin);
		return "siginn-form";
	}

	@PostMapping("addnewuserlogin")
	public String addPerson(@Valid @ModelAttribute("userLogin") Person thePerson ,Error error) {
		loginService.addlogindetails(thePerson);
		return "redirect:/user/person/listallpersons";
	}

}
