package com.rock.springmvc.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloSpringMvc {
	
	@RequestMapping("/Hello")
	public String say() throws Exception{
		System.out.println("hi  baby");
		return "success";
	}
}
