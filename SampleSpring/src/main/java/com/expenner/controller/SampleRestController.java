package com.expenner.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleRestController {
	@RequestMapping("/person")
	public Person getPerson() {
		return new Person("sekhar", "sekhar.pasem@gmail.com");
	}
}
