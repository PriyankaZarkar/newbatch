package com.model;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {
	@RequestMapping(value="/log")
	public String m1(@RequestParam("uname") String un,@RequestParam("pass") String ps,Model m)
	{
		System.out.println(un);
		System.out.println(ps);
		m.addAttribute("a", un);
		m.addAttribute("b", ps);
		return "success";
		
		}
	
}
