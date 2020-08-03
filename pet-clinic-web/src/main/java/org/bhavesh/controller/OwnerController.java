package org.bhavesh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owner")
public class OwnerController {
	
	@RequestMapping({"","/","/index","/index.html"})
	public String getVetindexPage()
	{
		return "/owner/index";
	}
}
