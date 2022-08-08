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

import com.chainsys.newbornbabyhealthtrackingsystem.model.HospitalStaff;
import com.chainsys.newbornbabyhealthtrackingsystem.services.HospitalServices;
import com.chainsys.newbornbabyhealthtrackingsystem.services.HospitalStaffServices;
import com.chainsys.newbornbabyhealthtrackingsystem.services.PersonServices;

/**
 * @author shan3102
 *
 */
@Controller
@RequestMapping("/admin/hospitalstaff")
public class HospitalStaffController {
	@Autowired
	private HospitalStaffServices hospitalStaffServices;
	@Autowired
	private HospitalServices hospitalServices;
	@Autowired
	private PersonServices personServices;

	@GetMapping("/listallhospitalstaffs")
	public String getAllHospitalStaffs(Model model) {
		List<HospitalStaff> hospitalStaffList = hospitalStaffServices.getHospitalStaffs();
		model.addAttribute("listAllHospitalStaffs", hospitalStaffList);
		return "list-hospital-staff";
	}

	@GetMapping("/fetchhospitalstaff")
	public String getHospitalStaffById(@RequestParam("id") int hospitalId, Model model) {
		HospitalStaff theHospitalStaff = hospitalStaffServices.getHospitalStaffById(hospitalId);
		model.addAttribute("fetchHospitalStaffById", theHospitalStaff);
		return "find-by-id-hospital-staff-form";
	}

	@GetMapping("/addhospitalstaffform")
	public String showHospitalStaffAddForm(Model model) {
		HospitalStaff theHospitalStaff = new HospitalStaff();
		model.addAttribute("addHospitalStaff", theHospitalStaff);
		return "add-form-hospital-staff";
	}

	@PostMapping("addhospitalstaffs")
	public String addHospitalStaff(@ModelAttribute("addHospitalStaff") HospitalStaff theHospitalStaff) {
		hospitalStaffServices.addHospitalStaff(theHospitalStaff);
		return "redirect:/admin/hospitalstaff/listallhospitalstaffs";
	}

	@GetMapping("/hospitalstaffmodifyform")
	public String showHospitalStaffUpdateForm(@RequestParam("id") int hospitalId, Model model) {
		HospitalStaff theHospitalStaff = hospitalStaffServices.getHospitalStaffById(hospitalId);
		model.addAttribute("modifyHospitalStaff", theHospitalStaff);
		return "update-form-hospital-staff";
	}

	@PostMapping("/modifyhospitalstaffs")
	public String updateHospitalStaff(@ModelAttribute("modifyHospitalStaff") HospitalStaff theHospitalStaff) {
		hospitalStaffServices.addHospitalStaff(theHospitalStaff);
		return "redirect:/admin/hospitalstaff/listallhospitalstaffs";
	}

	@GetMapping("/hospitalstaffdeleteform")
	public String deleteHospitalStaff(@RequestParam("id") long hospitalStaffId) {
		hospitalStaffServices.removeHospitalStaff(hospitalStaffId);
		return "redirect:/admin/hospitalstaff/listallhospitalstaffs";
	}
//	---------------------------------
	@GetMapping("/gethoscontactpersondetails")
	public String getHospitalContactPersonById(@RequestParam("id") long id, Model model) {

		HospitalStaff thehosstaff = hospitalStaffServices.getHospitalStaffById(id);
		model.addAttribute("fetchHospitalStaffById", thehosstaff);
		model.addAttribute("fetchHospitalById", hospitalServices.getHospitalById(thehosstaff.getHospitalId()));
		model.addAttribute("fetchPersonstaffById", personServices.getPersonById(thehosstaff.getStaffId()));
		return "find-by-id-hospital-staff-form";
	}
}
