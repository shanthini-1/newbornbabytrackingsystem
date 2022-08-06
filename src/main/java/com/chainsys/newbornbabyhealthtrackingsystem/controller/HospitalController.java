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

import com.chainsys.newbornbabyhealthtrackingsystem.dto.ContactPersonDTO;
import com.chainsys.newbornbabyhealthtrackingsystem.dto.PersonLocationDTO;
import com.chainsys.newbornbabyhealthtrackingsystem.model.Hospital;
import com.chainsys.newbornbabyhealthtrackingsystem.model.Person;
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
		model.addAttribute("listAllHospitals", hospitalList);
		return "list-hospitals";
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

	@GetMapping("/hospitaldeleteform")
	public String deleteHospital(@RequestParam("id") int hospitalId) {
		hospitalServices.removeHospital(hospitalId);
		return "redirect:/admin/hospital/listallhospitals";
	}
//	--------------------------------------
	@GetMapping("/gethoscontactperson")
	public String getHospitalContactPersonById(@RequestParam("id") int id, Model model) {
		Hospital theHospital = hospitalServices.getHosContactPersonById(id);
		model.addAttribute("fetchContactPersonById", theHospital);
		model.addAttribute("fetchConPerfromPersonById", personServices.getPersonById(theHospital.getContactPersonId()));
		return "find-by-id-hospital-person-form";
	}
}
