package com.hsbc.spring.controllers;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@Controller
@RestController
public class TestController {

	// @RequestMapping(path="greet",method = RequestMethod.GET)
	@GetMapping(path = "/greet/{user}")
	// @ResponseBody
	public String getMessage(@PathVariable("user") String name) {
		return "hello " + name;
	}

	@GetMapping(path="/concat",produces = MediaType.TEXT_PLAIN_VALUE)
	public String concat(@RequestParam("p1")String s1, @RequestParam("p2")String s2) {
		return s1 + " " + s2;
	}

}
