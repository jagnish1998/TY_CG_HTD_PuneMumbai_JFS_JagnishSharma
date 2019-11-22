package com.capgemini.newspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SpringBootController {

	@GetMapping(path = "/hello", produces = "text/plain")
	@ResponseBody
	public String welcomeMessage() {
		return "Welcome to Spring Boot";
	}// End of welcomeMessage
}// End of Controller
