package com.rock.springmvc.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("trane")
public class Trane {
	@RequestMapping("/trane1")
	public String run1()
	{
		System.out.println("11111");
	
		return "forward:/JSP/aa.jsp";
	}
	@RequestMapping("/trane2")
	public String run2()
	{
		System.out.println("22222");
		
		return "redirect:/JSP/bb.jsp";
	}
}
