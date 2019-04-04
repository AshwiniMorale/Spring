package com.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController 
{
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public ModelAndView welcome(HttpServletRequest req, HttpServletResponse res)
	{
		System.out.println("controller");
		//model.addAttribute("message", "hi spring mvc framework");
		
		return new ModelAndView("index","message","Welcome to Cyber");
	}

}
