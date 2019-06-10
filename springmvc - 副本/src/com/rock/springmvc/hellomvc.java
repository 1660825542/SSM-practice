package com.rock.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class hellomvc {
	@RequestMapping("/hellomvc")
	public String hello(){
		
		
		return "ok";
		
	}
}
