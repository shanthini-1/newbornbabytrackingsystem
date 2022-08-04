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
import com.chainsys.newbornbabyhealthtrackingsystem.services.ChildServices;

@Controller
@RequestMapping("/admin/child")
public class ChildController {
	@Autowired
	private ChildServices childServices;

	@GetMapping("/listallchilds")
	public String getAllChilds(Model model) {
		List<Child> childList = childServices.getChilds();
		model.addAttribute("listAllChilds", childList);
		return "list-childs";
	}

	@GetMapping("/fetchchild")
	public String getChildById(@RequestParam("id") int childId, Model model) {
		Child thechild = childServices.getChildById(childId);
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
		Child theChild = childServices.getChildById(childId);
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
}
