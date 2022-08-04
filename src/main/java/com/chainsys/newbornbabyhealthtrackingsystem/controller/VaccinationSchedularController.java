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

import com.chainsys.newbornbabyhealthtrackingsystem.model.VaccinationSchedular;
import com.chainsys.newbornbabyhealthtrackingsystem.services.VaccinationSchedularServices;

/**
 * @author shan3102
 *
 */
@Controller
@RequestMapping("/admin/vaccinationschedular")
public class VaccinationSchedularController {
	

		@Autowired
		private VaccinationSchedularServices vaccinationSchedularService;

		/*
		 * @GetMapping("/") public String index() { return "index"; }
		 */

		@GetMapping("/listallvaccinationSchedulars")
		public String getVaccinationSchedulars(Model model) {
			List<VaccinationSchedular> vaclist = vaccinationSchedularService.getVaccinationSchedulars();
			model.addAttribute("allvaccinationSchedulars", vaclist);
			return "list-vaccinationSchedulars";
		}

		@GetMapping("/fetchvaccinationSchedular")
		public String getVaccinationSchedularById(@RequestParam("id") int id, Model model) {
			VaccinationSchedular theVac = vaccinationSchedularService.getVaccinationSchedularsById(id);
			model.addAttribute("findvaccinationSchedularbyid", theVac);
			return "findbyid-vaccinationSchedular-form";
		}

		@GetMapping("/vaccinationSchedularaddform")
		public String showVaccinationSchedularAddForm(Model model) {
			VaccinationSchedular theVac = new VaccinationSchedular();
			model.addAttribute("addvaccinationSchedular", theVac);
			return "add-vaccinationSchedular-form";
		}

		@PostMapping("/addvaccinationSchedulars")
		public String addNewVaccinationSchedulars(@ModelAttribute("addvaccinationSchedular") VaccinationSchedular theVac) {
			vaccinationSchedularService.addVaccinationSchedular(theVac);
			return "redirect:/admin/vaccinationSchedular/vaccinationSchedularlist";
		}

		@GetMapping("/vaccinationSchedularmodifyform")
		public String showVaccinationSchedularUpdateForm(@RequestParam("id") int id, Model model) {
			VaccinationSchedular theVac = vaccinationSchedularService.getVaccinationSchedularsById(id);
			model.addAttribute("modifyvaccinationSchedular", theVac);
			return "update-vaccinationSchedular-form";
		}

		@PostMapping("/modifyvaccinationSchedular")
		public String modifyingVaccinationSchedular(@ModelAttribute("modifyvaccinationSchedular") VaccinationSchedular theVac) {
			vaccinationSchedularService.addVaccinationSchedular(theVac);
			return "redirect:/admin/vaccinationSchedular/vaccinationSchedularlist";
		}

		@GetMapping("/vaccinationSchedulardeleteform")
		public String showVaccinationSchedularDeleteForm(@RequestParam("id") int id, Model model) {
			vaccinationSchedularService.removeVaccinationSchedular(id);
			return "redirect:/admin/vaccinationSchedular/vaccinationSchedularlist";
		}
}
