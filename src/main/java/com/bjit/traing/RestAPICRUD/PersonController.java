package com.bjit.traing.RestAPICRUD;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PersonController {
	@GetMapping("/h")
public String hello() {
	return "hello";
}
}
