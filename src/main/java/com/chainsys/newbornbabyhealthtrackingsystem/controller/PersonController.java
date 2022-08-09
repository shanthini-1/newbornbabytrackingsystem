/**
 * 
 */
package com.chainsys.newbornbabyhealthtrackingsystem.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chainsys.newbornbabyhealthtrackingsystem.model.Person;
import com.chainsys.newbornbabyhealthtrackingsystem.services.LocationCodeServices;
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
	@Autowired
	private LocationCodeServices locServices;

	@GetMapping("/listallpersons")
	public String getAllPersons(Model model) {
		List<Person> personList = personServices.getPersons();
		model.addAttribute("listAllPersons", personList);
		return "list-persons";
	}

	@GetMapping("/userfindform")
	public String showUserFindForm() {
		return "fetch-user-form";
	}

	@GetMapping("/fetchperson")
	public String getPersonById(@RequestParam("id") Integer personId, Model model) {
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
	public String addPerson(@Valid @ModelAttribute("addPerson") Person thePerson ,Error error) {
		personServices.addPerson(thePerson);
		return "redirect:/user/person/listallpersons";
	}

	@GetMapping("/usermodifyform")
	public String showUserModifyForm() {
		return "user-modify-form";
	}

	@GetMapping("/personmodifyform")
	public String showPersonUpdateForm(@RequestParam("id") Integer personId, Model model) {
		Person thePerson = personServices.getPersonById(personId);
		model.addAttribute("modifyPerson", thePerson);
		return "update-form-person";
	}

	@PostMapping("/modifypersons")
	public String updatePerson(@Valid @ModelAttribute("modifyPerson") Person thePerson ,Error error) {
		personServices.addPerson(thePerson);
		return "redirect:/user/person/listallpersons";
	}

	@GetMapping("/userdeleteform")
	public String showUserdeleteForm() {
		return "user-delete-form";
	}

	@GetMapping("/persondeleteform")
	public String deletePerson(@RequestParam("id") Integer personId) {
		personServices.removePerson(personId);
		return "redirect:/user/person/listallpersons";
	}

//	----------------------------
	@GetMapping("/userlocationfindform")
	public String showUserLocationFindForm() {
		return "user-location-fetch";
	}

	@GetMapping("/getpersonlocation")
	public String getPersonLocationById(@RequestParam("perId") Integer userId, Model model) {
		Person theperson = personServices.getPersonById(userId);
		model.addAttribute("fetchPersonByIdA", theperson);
		model.addAttribute("fetchPersonloctionById", locServices.getLocationcodeById(theperson.getPinCode()));
		return "find-by-id-person-location-form";
	}
}
