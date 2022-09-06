package com.allan.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello World From Spring Framework !";
	}
	
	@GetMapping("/goodbye")
	public String goodBye() {
		return "Good Bye, see you later !";
	}

}