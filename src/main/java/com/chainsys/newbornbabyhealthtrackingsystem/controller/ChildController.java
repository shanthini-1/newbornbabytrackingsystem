package com.chainsys.newbornbabyhealthtrackingsystem.controller;
/*
 * 
 * @author
 */

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

import com.chainsys.newbornbabyhealthtrackingsystem.model.Child;
import com.chainsys.newbornbabyhealthtrackingsystem.model.Hospital;
import com.chainsys.newbornbabyhealthtrackingsystem.model.HospitalStaff;
import com.chainsys.newbornbabyhealthtrackingsystem.model.Person;
import com.chainsys.newbornbabyhealthtrackingsystem.services.ChildServices;
import com.chainsys.newbornbabyhealthtrackingsystem.services.HospitalServices;
import com.chainsys.newbornbabyhealthtrackingsystem.services.HospitalStaffServices;
import com.chainsys.newbornbabyhealthtrackingsystem.services.PersonServices;

@Controller
@RequestMapping("/admin/child")
public class ChildController {
	@Autowired
	private ChildServices childServices;
	@Autowired
	private HospitalServices hospitalServices;
	@Autowired
	private HospitalStaffServices hospitalStaffServices;
	@Autowired
	private PersonServices personServices;

	@GetMapping("/listallchilds")
	public String getAllChilds(Model model) {
		List<Child> childList = childServices.getChilds();
		model.addAttribute("listAllChilds", childList);
		return "list-childs";
	}
	@GetMapping("/fetchchildform")
	public String showChildDetailForm() {
		return "fetch-child-by-id-form";
	}

	@GetMapping("/fetchchild")
	public String getChildById(@RequestParam("id") int childId, Model model) {
		Child thechild = childServices.findById(childId);
		model.addAttribute("fetchChildById", thechild);
		return "find-by-id-child-form";
	}

	@GetMapping("/addchildform")
	public String showChildAddForm(Model model) {
		Child theChild = new Child();
		model.addAttribute("addChild", theChild);
		return "add-form-child";
	}

	@PostMapping("addchilds")
	public String addChild(@ModelAttribute("addChild") Child theChild) {
		childServices.addChild(theChild);
		return "redirect:/admin/child/listallchilds";
	}
	@GetMapping("/updatechildform")
	public String showChildUpdateDetailForm() {
		return "update-child-by-id-form";
	}
	@GetMapping("/childmodifyform")
	public String showChildUpdateForm(@RequestParam("id") int childId, Model model) {
		Child theChild = childServices.findById(childId);
		model.addAttribute("modifyChild", theChild);
		return "update-form-child";
	}
	
	@PostMapping("/modifychilds")
	public String updateChildForm(@ModelAttribute("modifyChild") Child theChild) {
		childServices.addChild(theChild);
		return "redirect:/admin/child/listallchilds";
	}
	@GetMapping("/Deletechildform")
	public String showChildDeleteDetailForm() {
		return "delete-child-by-id-form";
	}
	@GetMapping("/childdeleteform")
	public String deleteChild(@RequestParam("id") int childId) {
		childServices.removeChild(childId);
		return "redirect:/admin/child/listallchilds";
	}

//	----------------------------------
	@GetMapping("/fetchhospitalandchildform")
	public String showHospitalChildDetailForm() {
		return "fetch-hospital-child-form";
	}
	@GetMapping("/childhospitaldetails")
	public String getChildHospitalDetails(@RequestParam("id") int childId, Model model) {
		Child theChild = childServices.findById(childId);
		model.addAttribute("childDetails", theChild);
		model.addAttribute("childHospitaldetails", hospitalServices.getHospitalById(theChild.getHospitalId()));
		return "find-by-id-child-hospital-form";
	}

//	-----------------------
	@GetMapping("/fetchdoctorandchildform")
	public String showDoctorChildDetailForm() {
		return "fetch-doctor-child-form";
	}
	@GetMapping("/childdoctordetails")
	public String getChilddoctorDetails(@RequestParam("id") int childId, Model model) {
		Child theChild = childServices.findById(childId);
		model.addAttribute("childDetails", theChild.getChildId());
		model.addAttribute("childDoctordetails", hospitalStaffServices.getHospitalStaffById(theChild.getDoctorId()));
		return "find-by-id-child-doctor-form";
	}

//	------------------------
	@GetMapping("/fetchchildandparent")
	public String showChildparentDetailForm() {
		return "fetch-parent-child-form";
	}
	@GetMapping("/childparentdetails")
	public String getChildParentDetails(@RequestParam("id") int childId, Model model) {
		Child theChild = childServices.findById(childId);
		model.addAttribute("childdetails", theChild);
		model.addAttribute("childFatherdetails", personServices.getPersonById(theChild.getFatherId()));
		model.addAttribute("childMotherdetails", personServices.getPersonById(theChild.getMotherId()));
		return "find-by-id-child-parent-form";
	}

	@GetMapping("/fetchchildandguardian")
	public String showChildGuardianDetailForm() {
		return "fetch-guardian-child-form";
	}
	@GetMapping("/childguardiandetails")
	public String getChildGuardianDetails(@RequestParam("id") int childId, Model model) {
		Child theChild = childServices.findById(childId);
		model.addAttribute("childdetails", theChild);
		model.addAttribute("childFatherdetails", personServices.getPersonById(theChild.getFatherId()));
		model.addAttribute("childMotherdetails", personServices.getPersonById(theChild.getMotherId()));
		model.addAttribute("childGuardianDetails", personServices.getPersonById(theChild.getGuardianId()));
		return "find-by-id-child-guardian-form";
	}
//	-----------------------------
	@GetMapping("/fetchchildbyhospitalid")
	public String showChildHospitalFindForm() {
		return "list-child-by-hospital-form";
	}
	@GetMapping("listchildbyhospitalid")
	public String listChildByHospitalId(@RequestParam("hospitalId") int hospitalId, Model model) {
		Hospital hospital = hospitalServices.getHospitalById(hospitalId);
		model.addAttribute("hospital", hospital);
		List<Child> childs = childServices.getChildByHospitalId(hospitalId);
		model.addAttribute("listofchildbyhospital", childs);
		return "list-childs-by-hospital";
	}

//	----------------------------------
	@GetMapping("/fetchchildbydoctorid")
	public String showChildDoctorFindForm() {
		return "list-child-by-doctor-form";
	}
	@GetMapping("listchildbydoctorid")
	public String listChildByDoctorId(@RequestParam("doctorId") Integer doctorId, Model model) {
		Optional<HospitalStaff> hospitalStaff = hospitalStaffServices.getHospitalStaffById(doctorId);
		model.addAttribute("hospitalDoctor", hospitalStaff);
		List<Child> childs = childServices.getChildDoctorId(doctorId);
		model.addAttribute("listofchildbydoctor", childs);
		return "list-childs-by-doctor";
	}

//	-------------------------------------
// try to do this by both father and mother id select * from child where fatherid = & motherid
	@GetMapping("/fetchchildbyparentid")
	public String showChildParentFindForm() {
		return "list-child-by-parent-form";
	}
	@GetMapping("listchildbyparentid")
	public String listChildByFatherId(@RequestParam("fId") Integer fatherId, @RequestParam("mId") Integer motherId,
			Model model) {
		Person father = personServices.getPersonById(fatherId);
		Person mother = personServices.getPersonById(motherId);
		model.addAttribute("childsFather", father);
		model.addAttribute("childsMother", mother);
		List<Child> childs = childServices.getChildFatherMotherId(fatherId, motherId);
		model.addAttribute("listofchildbyparent", childs);
		return "list-childs-by-parent";
	}

//	--------------------------
	
	@GetMapping("/fetchchildbyguardian")
	public String showChildGuardianFindForm() {
		return "list-child-by-guardian-form";
	}
	@GetMapping("listchildbyguardianid")
	public String listChildByGuardianId(@RequestParam("gId") Integer guardianId, Model model) {
		Person guardian = personServices.getPersonById(guardianId);
		model.addAttribute("childGuardian", guardian);
		List<Child> childs = childServices.getChildGuardianId(guardianId);
		model.addAttribute("listofchildbyguardian", childs);
		return "list-childs-by-gaurdian";
	}

}
