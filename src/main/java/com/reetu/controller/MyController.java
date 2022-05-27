package com.reetu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {
	
	
	  
	@RequestMapping("/")
	public String reetu() {
		return "index";
	}
	
	@RequestMapping("/add")
	public String sum(int num1, int num2, Model model)
	{
		int sum = num1+num2;
		
		model.addAttribute("result", sum);
		 return "AddResult";
		
	}
	  

}
