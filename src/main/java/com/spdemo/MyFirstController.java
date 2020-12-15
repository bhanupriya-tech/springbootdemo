package com.spdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstController {
	@GetMapping("/hello")
	public String hello() {
		return "Hello Bhanu, this is printing from Hello operation..";
	}

}
