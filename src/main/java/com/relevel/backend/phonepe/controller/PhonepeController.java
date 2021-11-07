package com.relevel.backend.phonepe.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PhonepeController {

	@GetMapping("/ping")
	public String ping() {
		return "Ping is Successful";
	}
}

