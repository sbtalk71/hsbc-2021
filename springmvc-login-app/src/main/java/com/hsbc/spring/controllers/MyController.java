package com.hsbc.spring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

	@RequestMapping(path = "/test", method = RequestMethod.GET)
	public String welcomePage() {
		System.out.println("inside Controller...");
		return "welcome";
	}

	@RequestMapping(path = "/login", method = RequestMethod.GET)
	public String getPage() {
		System.out.println("inside Controller...");
		return "login";
	}

	@RequestMapping(path = "/processLogin", method = RequestMethod.POST)
	public String handleSubmit(@RequestParam("username") String user, @RequestParam("password") String pwd) {
		if (user.equals(pwd)) {
			return "success";
		} else {
			return "failure";
		}

	}

}
