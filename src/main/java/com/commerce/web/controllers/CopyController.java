package com.commerce.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*
 *  Pages that tell about the company 'About'
 *  which contains copyright and the general information
 *  are known as copy content
 */

@Controller
public class CopyController {

	@RequestMapping("/about")
	public String about(){
		
		return "copy/about";
	}
}
