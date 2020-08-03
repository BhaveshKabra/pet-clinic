package org.bhavesh.controller;

import java.util.Set;

import org.bhavesh.model.Owner;
import org.bhavesh.service.OwnerService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owner")
public class OwnerController {
	
	private OwnerService ownerService;
	
	public OwnerController(OwnerService ownerService) {
		this.ownerService = ownerService;
	}
	
	@RequestMapping({"","/","/index","/index.html"})
	public String getOwnerindexPage(Model model)
	{
		Set <Owner> ownerset=ownerService.findAll();
		model.addAttribute("ownerset",ownerset);
		return "/owner/index";
	}
}
