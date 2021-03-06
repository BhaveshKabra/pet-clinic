package org.bhavesh.controller;

import java.util.Set;

import org.bhavesh.model.Pet;
import org.bhavesh.service.PetService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pet")
public class PetController {
	
	private PetService petService;
	
	public PetController(PetService petService) {
		this.petService = petService;
	}

	@RequestMapping({"","/","/index","/index.html"})
	public String getVetindexPage(Model model)
	{
		Set <Pet> petset=petService.findAll();
		model.addAttribute("petset",petset);
		return "/pet/index";
	}
}
