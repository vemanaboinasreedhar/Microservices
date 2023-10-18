package com.vsr.apigateway.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class ApiController {
	 @GetMapping("/empServiceFallBack")
	    public String userServiceFallBackMethod() {
	        return "Employee Service is taking longer than Expected." +
	                " Please try again later";
	    }

	    @GetMapping("/departmentServiceFallBack")
	    public String departmentServiceFallBackMethod() {
	        return "Department Service is taking longer than Expected." +
	                " Please try again later";
	    }

}
