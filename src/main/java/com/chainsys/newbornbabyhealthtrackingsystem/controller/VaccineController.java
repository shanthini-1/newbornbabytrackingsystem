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

import com.chainsys.newbornbabyhealthtrackingsystem.pojo.Vaccine;
import com.chainsys.newbornbabyhealthtrackingsystem.services.VaccineServices;

/**
 * @author shan3102
 *
 */
@Controller
@RequestMapping("/vaccine")
public class VaccineController {
	@Autowired
	private VaccineServices vacservices;
	
	@GetMapping("/vaccinelist")
	public String getVaccine(Model model) {
		List<Vaccine> vaclist = vacservices.getvaccines();
		model.addAttribute("allvaccines", vaclist);
		return "list-vaccines";
	}
	
	@GetMapping("/vaccineaddform")
	public String showVaccineAddForm(Model model) {
		Vaccine thevac = new Vaccine();
		model.addAttribute("addvaccine",thevac);
		return "add-vaccine-form";
		}
	
	@PostMapping("/addvaccines")
	public String addNewVaccines(@ModelAttribute("addvaccine") Vaccine theVac) {
		vacservices.addVaccine(theVac);
		return "redirect:/vaccine/vaccinelist";
	}
	
	@GetMapping("/vaccineaddform")
	public String showVaccineModifyForm(Model model) {
		Vaccine thevac = new Vaccine();
		model.addAttribute("modifyvaccine",thevac);
		return "add-vaccine-form";
		}
	
	@PostMapping("/vaccineupdateform")
	public String modifyingVaccines(@ModelAttribute("modifyvaccine") Vaccine theVac) {
		vacservices.addVaccine(theVac);
		return "update-vaccine-form";
	}
	
	}
