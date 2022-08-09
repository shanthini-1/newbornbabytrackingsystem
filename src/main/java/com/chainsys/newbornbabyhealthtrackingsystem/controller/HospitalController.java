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

import com.chainsys.newbornbabyhealthtrackingsystem.model.Hospital;
import com.chainsys.newbornbabyhealthtrackingsystem.services.HospitalServices;
import com.chainsys.newbornbabyhealthtrackingsystem.services.PersonServices;

/**
 * @author shan3102
 *
 */
@Controller
@RequestMapping("/admin/hospital")
public class HospitalController {
	@Autowired
	private HospitalServices hospitalServices;
	@Autowired
	private PersonServices personServices;

	@GetMapping("/listallhospitals")
	public String getAllHospitals(Model model) {
		List<Hospital> hospitalList = hospitalServices.getHospitals();
		model.addAttribute("listAllTheHospitals", hospitalList);
		return "list-hospital";
	}

	@GetMapping("/hospitalfindform")
	public String showHospitalFindForm() {
		return "hospital-find-form";
	}

	@GetMapping("/fetchhospital")
	public String getHospitalById(@RequestParam("id") int hospitalId, Model model) {
		Hospital thehospital = hospitalServices.getHospitalById(hospitalId);
		model.addAttribute("fetchHospitalById", thehospital);
		return "find-by-id-hospital-form";
	}

	@GetMapping("/addhospitalform")
	public String showHospitalAddForm(Model model) {
		Hospital theHospital = new Hospital();
		model.addAttribute("addHospital", theHospital);
		return "add-form-hospital";
	}

	@PostMapping("/addhospitals")
	public String addHospital(@ModelAttribute("addHospital") Hospital theHospital) {
		hospitalServices.addHospital(theHospital);
		return "redirect:/admin/hospital/listallhospitals";
	}
	@GetMapping("/showhospitalupdateform")
	public String showHospitalModifyForm() {
		return "hospital-modify-form";
	}

	@GetMapping("/hospitalmodifyform")
	public String showHospitalUpdateForm(@RequestParam("id") int hospitalId, Model model) {
		Hospital theHospital = hospitalServices.getHospitalById(hospitalId);
		model.addAttribute("modifyHospital", theHospital);
		return "update-form-hospital";
	}

	@PostMapping("/modifyhospitals")
	public String updateHospital(@ModelAttribute("modifyHospital") Hospital theHospital) {
		hospitalServices.addHospital(theHospital);
		return "redirect:/admin/hospital/listallhospitals";
	}
	@GetMapping("/showhospitaldeleteform")
	public String HospitalDeleteForm() {
		return "hospital-delete-form";
	}

	@GetMapping("/hospitaldeleteform")
	public String deleteHospital(@RequestParam("id") int hospitalId) {
		hospitalServices.removeHospital(hospitalId);
		return "redirect:/admin/hospital/listallhospitals";
	}

//	--------------------------------------
	@GetMapping("/hoscontactfindform")
	public String showContactPersonFindForm() {
		return "hospital-contactperson-form";
	}

	@GetMapping("/gethospitalcontactperson")
	public String getHospitalContactPersonById(@RequestParam("id") Integer id, Model model) {
		List<Hospital> hospitals = hospitalServices.getHospitalsByContactperson(id);
		model.addAttribute("listHosByConPersonId", hospitals);
		model.addAttribute("fetchConPerfromPersonById", personServices.getPersonById(id));
		return "list-hospitals-by-contact-person-form";
	}
}
