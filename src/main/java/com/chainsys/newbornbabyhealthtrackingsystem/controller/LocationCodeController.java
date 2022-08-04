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

import com.chainsys.newbornbabyhealthtrackingsystem.model.LocationCode;
import com.chainsys.newbornbabyhealthtrackingsystem.services.LocationCodeServices;

/**
 * @author shan3102
 *
 */
@Controller
@RequestMapping("/admin/location")
public class LocationCodeController {
	@Autowired
	private LocationCodeServices locationCodeService;

	@GetMapping("/listalllocations")
	public String getLocation(Model model) {
		List<LocationCode> locationCodeList = locationCodeService.getLocation();
		model.addAttribute("listAllLocation", locationCodeList);
		return "list-locations";
	}
	
	@GetMapping("/fetchlocation")
	public String getLocationById(@RequestParam("id") int locId, Model model ) {
		LocationCode theloc = locationCodeService.getLocationcodeById(locId);
		model.addAttribute("fetchLocationById", theloc);
		return "find-by-id-location-form";
	}
	@GetMapping("/addlocationform")
	public String showLocationAddForm(Model model) {
		LocationCode theLoc = new LocationCode();
		model.addAttribute("addLocation", theLoc);
		return "add-form-location";
	}
	@PostMapping("/addlocations")
	public String addLocation(@ModelAttribute("addLocation") LocationCode theLoc) {
		locationCodeService.addLocation(theLoc);
		return"redirect:/admin/location/listalllocations";
	}
	
	@GetMapping("/locationmodifyform")
	public String showLocationUpdateForm(@RequestParam("id") int locId ,Model model) {
		LocationCode theLoc = locationCodeService.getLocationcodeById(locId);
		model.addAttribute("modifyLocation", theLoc);
		return "update-form-location";
	}
	@PostMapping("/modifylocations")
	public String updateLocation(@ModelAttribute("modifyLocation") LocationCode theLoc) {
		locationCodeService.addLocation(theLoc);
		return"redirect:/admin/location/listalllocations";
	}
	
	@GetMapping("/locationdeleteform")
	public String deleteLocation(@RequestParam("id") int locId) {
		locationCodeService.removeLocation(locId);
		return "redirect:/admin/location/listalllocations";
	}
}
