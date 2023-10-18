package com.vsr.employeeservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/emp")
public class ApiController {
	
	@GetMapping
	public String getEmp() {
		return " WELCOME TO EMPLOYEE SERVICE";
	}

}
