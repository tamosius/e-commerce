package com.commerce.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// tell Spring this is the controller
@Controller
public class IndexController {

	@RequestMapping("/")
	public String home(){
		
		return "index";
	}
}
