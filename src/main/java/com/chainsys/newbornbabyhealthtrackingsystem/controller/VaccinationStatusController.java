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

import com.chainsys.newbornbabyhealthtrackingsystem.compsitemodel.ChildVaccineCompositeTable;
import com.chainsys.newbornbabyhealthtrackingsystem.model.VaccinationStatus;
import com.chainsys.newbornbabyhealthtrackingsystem.services.ChildServices;
import com.chainsys.newbornbabyhealthtrackingsystem.services.VaccinationStatusServices;
import com.chainsys.newbornbabyhealthtrackingsystem.services.VaccineServices;

/**
 * @author shan3102
 *
 */
@Controller
@RequestMapping("/admin/vaccinationstatus")
public class VaccinationStatusController {

	@Autowired
	private VaccinationStatusServices vaccinationStatusService;

	@Autowired
	private ChildServices childServices;
	@Autowired
	private VaccineServices vaccineServices;

	@GetMapping("/listallvaccinationstatus")
	public String getVaccinationStatus(Model model) {
		List<VaccinationStatus> vaccinationStatusList = vaccinationStatusService.getVaccinationStatus();
		model.addAttribute("allVaccinationStatuslist", vaccinationStatusList);
		return "list-vaccination-status";
	}

	@GetMapping("/fetchvaccinationstatus")
	public String getVaccinationStatusById(@RequestParam("childid") int childId, @RequestParam("vacId") int vacId,
			Model model) {
		ChildVaccineCompositeTable compObj = new ChildVaccineCompositeTable(childId, vacId);
		Optional<VaccinationStatus> theVac = vaccinationStatusService.getVaccinationStatussById(compObj);
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
	public String showVaccinationStatusUpdateForm(@RequestParam("childId") int childId,
			@RequestParam("vacId") int vacId, Model model) {
		ChildVaccineCompositeTable compObj = new ChildVaccineCompositeTable(childId, vacId);
		Optional<VaccinationStatus> theVac = vaccinationStatusService.getVaccinationStatussById(compObj);
		model.addAttribute("modifyvaccinationStatus", theVac);
		return "update-vaccinationstatus-form";
	}

	@PostMapping("/modifyvaccinationStatus")
	public String modifyingVaccinationStatus(@ModelAttribute("modifyvaccinationStatus") VaccinationStatus theVac) {
		vaccinationStatusService.addVaccinationStatus(theVac);
		return "redirect:/admin/vaccinationstatus/vaccinationstatuslist";
	}

	@GetMapping("/vaccinationStatusdeleteform")
	public String showVaccinationStatusDeleteForm(@RequestParam("childId") int childId,
			@RequestParam("vacId") int vacId, Model model) {
		ChildVaccineCompositeTable compObj = new ChildVaccineCompositeTable(childId, vacId);
		vaccinationStatusService.removeVaccinationStatus(compObj);
		return "redirect:/admin/vaccinationstatus/vaccinationstatuslist";
	}

/*	@GetMapping("/getbookbyauthorbookdetails")

	public String listChildbyVaccine(@RequestParam("vaccineId") ChildVaccineCompositeTable vaccineId, Model model) {
		//model.addAttribute("getVaccine",(vaccineServices.getVaccinesById(vaccineId)));
//		List<VaccinationStatus> vaccinationStatus = vaccinationStatusService.getChildrenListByVacId(vaccineId);
		model.addAttribute("getVaccine",);
		Optional<VaccinationStatus> vaccinationStatus = vaccinationStatusService.getVaccinationStatussById(vaccineId);
		model.addAttribute("vacchilddetailslist", vaccinationStatus);
		List<Child>childs=childServices.findByChildId(vaccinationStatus.get());
		return "list-childs-vaccinestatus";
	}*/
}