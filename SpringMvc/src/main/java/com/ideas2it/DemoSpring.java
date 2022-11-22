package com.ideas2it;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DemoSpring {
	
	@RequestMapping("/add")
	public String display() {
		System.out.println("display called");
		return "SpringFile";
	}

}