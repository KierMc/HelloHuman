package com.kiernan.hellohuman.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String search(@RequestParam(value="name", required=false) String nameFromClient) {
		if (nameFromClient == null) {
			return "Hello Human";
		}
		else {
			return "Hello " + nameFromClient;
		}
	}
	

}
