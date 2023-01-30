package com.BikkadIT.SpringMVCFirstApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetController {

		public GreetController() {
			System.out.println("GreetController");
		}

	@GetMapping("/greet")
	public String greetMsg(Model model) {
		
		String greetMsg="Good Morning";
		model.addAttribute("GREETMSG", greetMsg);
		return "greet";
		
	}
}
