/**
 * 
 */
package com.chainsys.newbornbabyhealthtrackingsystem.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chainsys.newbornbabyhealthtrackingsystem.model.Person;
import com.chainsys.newbornbabyhealthtrackingsystem.services.PersonServices;

/**
 * @author shan3102
 *
 */
@Controller
@RequestMapping("/user/person")
public class PersonController {
	@Autowired
	private PersonServices personServices;

	@GetMapping("/listallpersons")
	public String getAllPersons(Model model) {
		List<Person> personList = personServices.getPersons();
		model.addAttribute("listAllPersons", personList);
		return "list-persons";
	}

	@GetMapping("/fetchperson")
	public String getPersonById(@RequestParam("id") int personId, Model model) {
		Person theperson = personServices.getPersonById(personId);
		model.addAttribute("fetchPersonById", theperson);
		return "find-by-id-person-form";
	}

	@GetMapping("/addpersonform")
	public String showPersonAddForm(Model model) {
		Person thePerson = new Person();
		model.addAttribute("addPerson", thePerson);
		return "add-form-person";
	}

	@PostMapping("addpersons")
	public String addPerson(@ModelAttribute("addPerson") Person thePerson) {
		personServices.addPerson(thePerson);
		return "redirect:/user/person/listallpersons";
	}

	@GetMapping("/personmodifyform")
	public String showPersonUpdateForm(@RequestParam("id") int personId, Model model) {
		Person thePerson = personServices.getPersonById(personId);
		model.addAttribute("modifyPerson", thePerson);
		return "update-form-person";
	}

	@PostMapping("/modifypersons")
	public String updatePerson(@ModelAttribute("modifyPerson") Person thePerson) {
		personServices.addPerson(thePerson);
		return "redirect:/user/person/listallpersons";
	}

	@GetMapping("/persondeleteform")
	public String deletePerson(@RequestParam("id") int personId) {
		personServices.removePerson(personId);
		return "redirect:/user/person/listallpersons";
	}
}
