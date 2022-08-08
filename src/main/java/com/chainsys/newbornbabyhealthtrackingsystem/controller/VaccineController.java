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

import com.chainsys.newbornbabyhealthtrackingsystem.model.Vaccine;
import com.chainsys.newbornbabyhealthtrackingsystem.services.VaccineServices;

/**
 * @author shan3102
 *
 */
@Controller
@RequestMapping("/admin/vaccine")
public class VaccineController {
	@Autowired
	private VaccineServices vacServices;

	/*
	 * @GetMapping("/") public String index() { return "index"; }
	 */

	@GetMapping("/listallvaccines")
	public String getVaccines(Model model) {
		List<Vaccine> vaclist = vacServices.getVaccines();
		model.addAttribute("allvaccines", vaclist);
		return "list-vaccines";
	}

	@GetMapping("/fetchvaccine")
	public String getVaccineById(@RequestParam("id") int vacId, Model model) {
		Vaccine theVac = vacServices.getVaccinesById(vacId);
		model.addAttribute("findvaccinebyid", theVac);
		return "findbyid-vaccine-form";
	}

	@GetMapping("/vaccineaddform")
	public String showVaccineAddForm(Model model) {
		Vaccine theVac = new Vaccine();
		model.addAttribute("addvaccine", theVac);
		return "add-vaccine-form";
	}

	@PostMapping("/addvaccines")
	public String addNewVaccines(@ModelAttribute("addvaccine") Vaccine vaccine) {
		vacServices.addVaccine(vaccine);
		return "redirect:/admin/vaccine/listallvaccines";
	}

	@GetMapping("/vaccinemodifyform")
	public String showVaccineUpdateForm(@RequestParam("id") int id, Model model) {
		Vaccine theVac = vacServices.getVaccinesById(id);
		model.addAttribute("modifyvaccine", theVac);
		return "update-vaccine-form";
	}

	@PostMapping("/modifyvaccines")
	public String modifyingVaccine(@ModelAttribute("modifyvaccine") Vaccine vac) {
		vacServices.addVaccine(vac);
		return "redirect:/admin/vaccine/listallvaccines";
	}

	@GetMapping("/vaccinedeleteform")
	public String showVaccineDeleteForm(@RequestParam("id") int id, Model model) {
		vacServices.removeVaccine(id);
		return "redirect:/admin/vaccine/listallvaccines";
	}
}
