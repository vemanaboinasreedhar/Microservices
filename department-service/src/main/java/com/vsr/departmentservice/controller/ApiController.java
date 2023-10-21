package com.vsr.departmentservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dept")
public class ApiController {
	
	@GetMapping
	public String getEmp() throws InterruptedException{
		return " WELCOME TO DEPARTMENT SERVICE";
	}

}