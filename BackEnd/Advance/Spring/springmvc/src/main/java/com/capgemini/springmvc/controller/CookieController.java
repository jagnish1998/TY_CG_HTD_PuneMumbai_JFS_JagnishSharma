package com.capgemini.springmvc.controller;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CookieController {

	@GetMapping("/cookiePage")
	public String displayCookiePage() {

		return "cookiePage";
	}

	@GetMapping("/createCookie")
	public String createCookie(HttpServletResponse resp, ModelMap map) {
		Cookie myCookie = new Cookie("name", "Jagnish");
		resp.addCookie(myCookie);
		map.addAttribute("msg", "Cookie Created Successfully");
		return "cookiePage";

	}

	@GetMapping("/readCookie")
	public String readCookie(@CookieValue(name = "name") String name,ModelMap map) {
		map.addAttribute("msg","Cookie Value is "+name);
		return "cookiePage";
	}
}
