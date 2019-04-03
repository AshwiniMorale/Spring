package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/")
public class WelcomeController 
{
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String welcome(Model model)
	{
		model.addAttribute("message", "hi spring mvc framework");
		return "welcome";
	}

}
