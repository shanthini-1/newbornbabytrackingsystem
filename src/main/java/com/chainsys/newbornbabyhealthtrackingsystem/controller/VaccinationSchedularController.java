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

import com.chainsys.newbornbabyhealthtrackingsystem.model.Child;
import com.chainsys.newbornbabyhealthtrackingsystem.model.VaccinationSchedular;
import com.chainsys.newbornbabyhealthtrackingsystem.services.ChildServices;
import com.chainsys.newbornbabyhealthtrackingsystem.services.VaccinationSchedularServices;
import com.chainsys.newbornbabyhealthtrackingsystem.services.VaccineServices;

/**
 * @author shan3102
 *
 */
@Controller
@RequestMapping("/admin/vaccinationschedular")
public class VaccinationSchedularController {

	@Autowired
	private VaccinationSchedularServices vaccinationSchedularService;
	@Autowired
	private ChildServices childServices;
	@Autowired
	private VaccineServices vaccineServices;

// list of child scheduled for vaccination

	@GetMapping("/vaccineSchedularformparam")
	public String showFormVacScheduler() {
		return "generate-child-vaccineschedular-form";
	}



	@GetMapping("/vaccineSchedularform")
	public String showVaccinationSchedularAddForm(@RequestParam("childId") int cid, Model model) {
		Child childObj = childServices.findById(cid);
		List<VaccinationSchedular> vacSc= vaccinationSchedularService.getVaccinationSchedularsById(cid);
		model.addAttribute("childDetail", childObj);
		model.addAttribute("vaccinesch",vacSc);
		return "generate-child-vaccineschedular";
	}

}
