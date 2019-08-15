package com.hibernateRelationship.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	@GetMapping("/")
	public String index()
	{
		System.out.println("/ request...");
		System.out.println("updated from remote repository...");
		return "index.jsp";
	}
}
