/**
 * 
 */
package com.chainsys.newbornbabyhealthtrackingsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.chainsys.newbornbabyhealthtrackingsystem.model.Person;
import com.chainsys.newbornbabyhealthtrackingsystem.repository.PersonRepository;
import com.chainsys.newbornbabyhealthtrackingsystem.services.PersonServices;

/**
 * @author shan3102
 *
 */
@Controller
@RequestMapping("/person")
public class PersonController {
	@Autowired
	private PersonServices personServices;
	
	@GetMapping("/")
	public String index() {
		return "index";
	}
	@GetMapping("/listallpersons")
	public String getAllPersons(Model model) {
		List<Person> personList =personServices.getPersons(); 
		model.addAttribute("listallpersons", personList);
		return "list-persons";
	}

}
