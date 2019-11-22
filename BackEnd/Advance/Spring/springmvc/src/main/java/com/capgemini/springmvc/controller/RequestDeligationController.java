package com.capgemini.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RequestDeligationController {

	@GetMapping("/redirect")
	public String redirectRequest() {
		
		return "redirect:http://www.google.com";
	}// End of Redirect

	@GetMapping("/forward")
	public String forwardRequest() {
		
		return "forward:/loginForm";
	}

}
