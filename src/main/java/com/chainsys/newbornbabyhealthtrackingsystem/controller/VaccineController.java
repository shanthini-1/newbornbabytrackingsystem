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
	
	@GetMapping("/")
	public String index(){
		return "index";
}
	
	@GetMapping("/vaccinelist")
	public String getVaccines(Model model) {
		List<Vaccine> vaclist = vacServices.getVaccines();
		model.addAttribute("allvaccines", vaclist);
		return "list-vaccines";
	}
	
	@GetMapping("/getvaccine")
	public String getVaccineById(@RequestParam("id") int id, Model model) {
		Vaccine theVac = vacServices.getVaccinesById(id);
		model.addAttribute("findvaccinebyid", theVac);
		return "findbyid-vaccine-form";
	}
	
	@GetMapping("/vaccineaddform")
	public String showVaccineAddForm(Model model) {
		Vaccine theVac = new Vaccine();
		model.addAttribute("addvaccine",theVac);
		return "add-vaccine-form";
		}
	
	@PostMapping("/addvaccines")
	public String addNewVaccines(@ModelAttribute("addvaccine") Vaccine theVac) {
		vacServices.addVaccine(theVac);
		return "redirect:/admin/vaccine/vaccinelist";
	}
	
	@GetMapping("/vaccineupdateform")
	public String showVaccineUpdateForm(@RequestParam("id") int id, Model model) {
		Vaccine theVac =vacServices.getVaccinesById(id);
		model.addAttribute("modifyvaccine", theVac);
		return "update-vaccine-form";
	}
		
	@PostMapping("/modifyvaccine")
	public String modifyingVaccine(@ModelAttribute("modifyvaccine") Vaccine theVac) {
		vacServices.addVaccine(theVac);
		return "redirect:/admin/vaccine/vaccinelist";
	}
	
	@GetMapping("/vaccinedeleteform")
	public String showVaccineDeleteForm(@RequestParam("id") int id, Model model) {
		vacServices.removeVaccineById(id);
		return "redirect:/admin/vaccine/vaccinelist";
	}
	}
