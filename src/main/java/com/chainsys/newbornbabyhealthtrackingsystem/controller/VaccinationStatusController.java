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

import com.chainsys.newbornbabyhealthtrackingsystem.model.VaccinationStatus;
import com.chainsys.newbornbabyhealthtrackingsystem.services.VaccinationStatusServices;

/**
 * @author shan3102
 *
 */
@Controller
@RequestMapping("/admin/vaccinationstatus")
public class VaccinationStatusController {

	@Autowired
	private VaccinationStatusServices vaccinationStatusService;

	@GetMapping("/listallvaccinationstatus")
	public String getVaccinationStatus(Model model) {
		List<VaccinationStatus> vaccinationStatusList = vaccinationStatusService.getVaccinationStatus();
		model.addAttribute("allVaccinationStatuslist", vaccinationStatusList);
		return "list-vaccination-status";
	}

	@GetMapping("/fetchvaccinationstatus")
	public String getVaccinationStatusById(@RequestParam("id") int id, Model model) {
		VaccinationStatus theVac = vaccinationStatusService.getVaccinationStatussById(id);
		model.addAttribute("findVaccinationStatusById", theVac);
		return "findbyid-vaccinationstatus-form";
	}

	@GetMapping("/vaccinationstatusaddform")
	public String showVaccinationStatusAddForm(Model model) {
		VaccinationStatus theVac = new VaccinationStatus();
		model.addAttribute("addvaccinationStatus", theVac);
		return "add-vaccinationstatus-form";
	}

	@PostMapping("/addvaccinationstatuss")
	public String addNewVaccinationStatuss(@ModelAttribute("addvaccinationStatus") VaccinationStatus theVac) {
		vaccinationStatusService.addVaccinationStatus(theVac);
		return "redirect:/admin/vaccinationstatus/vaccinationstatuslist";
	}

	@GetMapping("/vaccinationstatusmodifyform")
	public String showVaccinationStatusUpdateForm(@RequestParam("id") int id, Model model) {
		VaccinationStatus theVac = vaccinationStatusService.getVaccinationStatussById(id);
		model.addAttribute("modifyvaccinationStatus", theVac);
		return "update-vaccinationstatus-form";
	}

	@PostMapping("/modifyvaccinationStatus")
	public String modifyingVaccinationStatus(
			@ModelAttribute("modifyvaccinationStatus") VaccinationStatus theVac) {
		vaccinationStatusService.addVaccinationStatus(theVac);
		return "redirect:/admin/vaccinationstatus/vaccinationstatuslist";
	}

	@GetMapping("/vaccinationStatusdeleteform")
	public String showVaccinationStatusDeleteForm(@RequestParam("id") int id, Model model) {
		vaccinationStatusService.removeVaccinationStatus(id);
		return "redirect:/admin/vaccinationstatus/vaccinationstatuslist";
	}

}