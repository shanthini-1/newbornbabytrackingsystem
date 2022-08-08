package com.chainsys.newbornbabyhealthtrackingsystem.controller;
/*
 * 
 * @author
 */

import java.util.List;

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

	@GetMapping("/childmodifyform")
	public String showChildUpdateForm(@RequestParam("id") int childId, Model model) {
		Child theChild = childServices.findById(childId);
		model.addAttribute("modifyChild", theChild);
		return "update-form-child";
	}

	@PostMapping("/modifychilds")
	public String updateChild(@ModelAttribute("modifyChild") Child theChild) {
		childServices.addChild(theChild);
		return "redirect:/admin/child/listallchilds";
	}

	@GetMapping("/childdeleteform")
	public String deleteChild(@RequestParam("id") int childId) {
		childServices.removeChild(childId);
		return "redirect:/admin/child/listallchilds";
	}
//------------------------------

	/*@GetMapping("/childvaccinestatus")
	public String getChildVaccineStautsByChildId(@RequestParam("childid") int childid, Model model) {
		VaccinationStatusDTO vaccinationStatusDTO = childServices.getChildVaccinestatus(childid);
		model.addAttribute("getChild", vaccinationStatusDTO.getChild());
		model.addAttribute("vaccstautsdetails", vaccinationStatusDTO.getVaccinationStatus());
		return "list-childs-vaccineStauts";
	}*/

//	----------------------------------

	@GetMapping("/childhospitaldetails")
	public String getChildHospitalDetails(@RequestParam("id") int childId, Model model) {
		Child theChild = childServices.findById(childId);
		model.addAttribute("childdetails", theChild.getChildId());
		model.addAttribute("childHospitaldetails", hospitalServices.getHospitalById(theChild.getHospitalId()));
		return "find-by-id-child-hospital-form";
	}
//	-----------------------
	@GetMapping("/childdoctordetails")
	public String getChilddoctorDetails(@RequestParam("id") int childId, Model model) {
		Child theChild = childServices.findById(childId);
		model.addAttribute("childdetails", theChild.getChildId());
		model.addAttribute("childDoctordetails", hospitalStaffServices.getHospitalStaffById(theChild.getDoctorId()));
		return "find-by-id-child-doctor-form";
	}
//	------------------------
//	check gauardian/parent
	@GetMapping("/childparentdetails")
	public String getChildParentDetails(@RequestParam("id") int childId, Model model) {
		Child theChild = childServices.findById(childId);
		model.addAttribute("childdetails", theChild);
		model.addAttribute("childFatherdetails", personServices.getPersonById(theChild.getFatherId()));
		model.addAttribute("childMotherdetails", personServices.getPersonById(theChild.getMotherId()));
		return "find-by-id-child-parent-form";
	}
	
	@GetMapping("/childguardiandetails")
	public String getChildGuardianDetails(@RequestParam("id") int childId, Model model) {
		Child theChild = childServices.findById(childId);
		model.addAttribute("childdetails", theChild);
		model.addAttribute("childFatherdetails", personServices.getPersonById(theChild.getFatherId()));
//		model.addAttribute("childMotherdetails", personServices.getPersonById(theChild.getMotherId()));
//		model.addAttribute("childguardiandetails", personServices.getPersonById(theChild.getGuardianId()));
		return "find-by-id-child-guardian-form";
	}
//	-----------------------------
	
	@GetMapping("listchildbyhospitalid")
	public String listChildByHospitalId(@RequestParam("id") int hospitalId,Model model) {
		Hospital hospital =hospitalServices.getHospitalById(hospitalId);
		model.addAttribute("hospital", hospital);
		List<Child> childs =childServices.getChildByHospitalId(hospitalId);
		model.addAttribute("listofchildbyhospital", childs);
		return "list-childs-by-hospital";
	}
//	----------------------------------
	@GetMapping("listchildbydoctorid")
	public String listChildByDoctorId(@RequestParam("id") long doctorId,Model model) {
		HospitalStaff hospitalStaff =hospitalStaffServices.getHospitalStaffById(doctorId);
		model.addAttribute("hospitalDoctor", hospitalStaff);
		List<Child> childs =childServices.getChildDoctorId(doctorId);
		model.addAttribute("listofchildbydoctor", childs);
		return "list-childs-by-doctor";
	}
//	-------------------------------------
//TODO: try to do this by both fatherandmother id select * from child where fatherid = & motherid
	@GetMapping("listchildbyfatherid")
	public String listChildByFatherId(@RequestParam("fId") long fatherId,@RequestParam("mId") long motherId,Model model) {
		Person father =personServices.getPersonById(fatherId);
		Person mother =personServices.getPersonById(motherId);
		model.addAttribute("childsParent", father);
		model.addAttribute("childsParent", mother);
		List<Child> childs =childServices.getChildFatherMotherId(fatherId,motherId);
		model.addAttribute("listofchildbyparent", childs);
		return "list-childs-by-parent";
	}

	/*
	 * @GetMapping("listchildbymotherid") public String
	 * listChildByMotherId(@RequestParam("id") long parentId,Model model) { Person
	 * person =personServices.getPersonById(parentId);
	 * model.addAttribute("childParent", person); List<Child> childs
	 * =childServices.getChildMotherId(parentId);
	 * model.addAttribute("listofchildbyparent", childs); return
	 * "list-childs-by-parent"; }
	 */
//	--------------------------
	@GetMapping("listchildbyguardianid")
	public String listChildByGuardianId(@RequestParam("id") long parentId,Model model) {
		Person person =personServices.getPersonById(parentId);
		model.addAttribute("childParent", person);
		List<Child> childs =childServices.getChildGuardianId(parentId);
		model.addAttribute("listofchildbyguardian", childs);
		return "list-childs-by-guardian";
	}
	
}
