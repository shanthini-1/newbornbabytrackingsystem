/**
 * 
 */
package com.chainsys.newbornbabyhealthtrackingsystem.controller;

import java.util.List;
import java.util.Optional;

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
//	public String redirectPage = "redirect:/admin/hospitalstaff/listallhospitalstaffs";
	@Autowired
	private HospitalStaffServices hospitalStaffServices;
	@Autowired
	private HospitalServices hospitalServices;
	@Autowired
	private PersonServices personServices;

	/*
	 * list all hospital staff
	 */
	@GetMapping("/listallhospitalstaffs")
	public String getAllHospitalStaffs(Model model) {
		List<HospitalStaff> hospitalStaffList = hospitalStaffServices.getHospitalStaffs();
		model.addAttribute("listAllHospitalStaffs", hospitalStaffList);
		return "list-hospital-staff";
	}
//-------------------------------
	/*
	 * fetch hospital staff by staffId - staffId giving form to find existence
	 */
	@GetMapping("/fetchstaffidform")
	public String showHospitalStaffFindForm() {
		return "hospitalstaff-find-form";
	}

	/*
	 * fetch hospital staff by staffId
	 */
	
	@GetMapping("/gethospitalstaff")
	public String getHospitalStaffById(@RequestParam("id") Integer staffId, Model model) {
		Optional<HospitalStaff> theHospitalStaff = hospitalStaffServices.getHospitalStaffById(staffId);
		model.addAttribute("fetchStaffDetailsById", theHospitalStaff);
		return "find-by-id-staff-form";
	}
//	-------------------------------------

	/*
	 * add staff form to enter details
	 */
	@GetMapping("/addhospitalstaffform")
	public String showHospitalStaffAddForm(Model model) {
		HospitalStaff theHospitalStaff = new HospitalStaff();
		model.addAttribute("addHospitalStaff", theHospitalStaff);
		return "add-form-hospital-staff";
	}

	/*
	 * list staffs after addind staff details
	 */
	@PostMapping("addhospitalstaffs")
	public String addHospitalStaff(@ModelAttribute("addHospitalStaff") HospitalStaff theHospitalStaff) {
		hospitalStaffServices.addHospitalStaff(theHospitalStaff);
		return "redirect:/admin/hospitalstaff/listallhospitalstaffs";
	}

	/*
	 * update staff details by staffId - staff id giving form to find
	 */
	@GetMapping("/hospitalstaffmodifyform")
	public String showHospitalStaffmodifyForm() {
		return "hospitalstaff-modify-form";
	}

	/*
	 * update staff details by staffId - staff details giving form
	 */
	@GetMapping("/hospitalstaffupdateform")
	public String showHospitalStaffUpdate(@RequestParam("id") int hospitalId, Model model) {
		Optional<HospitalStaff> theHospitalStaff = hospitalStaffServices.getHospitalStaffById(hospitalId);
		model.addAttribute("modifyHospitalStaff", theHospitalStaff);
		return "update-form-hospital-staff";
	}

	/*
	 * update staff details and list staffs after updating
	 */
	@PostMapping("/modifyhospitalstaffs")
	public String updateHospitalStaff(@ModelAttribute("modifyHospitalStaff") HospitalStaff theHospitalStaff) {
		hospitalStaffServices.addHospitalStaff(theHospitalStaff);
		return "redirect:/admin/hospitalstaff/listallhospitalstaffs";
	}

	/*
	 * Delete hospital staff by staffId form
	 */
	@GetMapping("/showhospitalstaffdeleteform")
	public String showHospitalStaffRemoveForm() {
		return "hospitalstaff-delete-form";
	}

	/*
	 * list show after staff deleted
	 */
	@GetMapping("/hospitalstaffdeleteform")
	public String deleteHospitalStaff(@RequestParam("id") Integer hospitalStaffId) {
		hospitalStaffServices.removeHospitalStaff(hospitalStaffId);
		return "redirect:/admin/hospitalstaff/listallhospitalstaffs";
	}

//	---------------------------------
	/*
	 * fetch staff profile details by Staff id - id giving form
	 */

	@GetMapping("/hospitalstaffdetailsfindform")
	public String showHospitalStaffDetailsFindForm() {
		return "hospital-staff-details-form";
	}

	/*
	 * display fetched staff profile details by Staff id
	 */
	@GetMapping("/gethospitalstaffpersondetails")
	public String getHospitalStaffDetailsById(@RequestParam("id") Integer id, Model model) {

		Optional<HospitalStaff> thehosstaff = hospitalStaffServices.getHospitalStaffById(id);
		model.addAttribute("fetchHospitalStaffById", thehosstaff);
		model.addAttribute("fetchHospitalById", hospitalServices.getHospitalById(thehosstaff.get().getHospitalId()));
		model.addAttribute("fetchstaffById", personServices.getPersonById(thehosstaff.get().getStaffId()));
		return "find-by-id-hospital-staff-form";
	}
}
