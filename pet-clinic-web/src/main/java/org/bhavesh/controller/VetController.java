package org.bhavesh.controller;

import java.util.Set;

import org.bhavesh.model.Vet;
import org.bhavesh.service.VetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/vet")
public class VetController {
	
	private VetService vetService;
	
	public VetController(org.bhavesh.service.VetService vetService) {
		this.vetService = vetService;
	}

	@RequestMapping({"","/","/index","/index.html"})
	public String getVetindexPage(Model model)
	{
		Set <Vet> vetset=vetService.findAll();
		model.addAttribute("vetset",vetset);
		return "/vet/index";
	}
}
