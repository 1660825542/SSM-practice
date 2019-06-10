package com.rock.springmvc.action;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.rock.springmvc.entities.User;
import com.sun.glass.ui.View;

@Controller
@RequestMapping("/user")
public class UserAction {

	
	
	@RequestMapping(value="/login",method=RequestMethod.POST,params={"userid=11","password"})
	public @ResponseBody String login(@RequestParam(value="userid",required=false) String userid)
	{
		System.out.println("???????");
		return "";
	}
	
	@ResponseBody
	@RequestMapping(value="/**/put",method=RequestMethod.PUT)
	public String put(@RequestParam(value="userid",required=false) String userid)
	{
		System.out.println("???????"+userid);
		return "";
		
	}
	
	
	@ResponseBody
	@RequestMapping(value="/**/delete",method=RequestMethod.DELETE)
	public String deldte(@RequestParam(value="userid",required=false) String userid)
	{
		System.out.println("!!!!!!!"+userid);
		return "";
		
	}
	
	
	
	@RequestMapping(value="/**/newUser",method=RequestMethod.POST)
	public ModelAndView newUser(User user)
	{
		System.out.println("!!!!!!!");
		System.out.println(user);
		ModelAndView mav=new ModelAndView("success");
		return mav;
		
	}
	@RequestMapping(value="/**/newUser1",method=RequestMethod.POST)
	public ModelAndView newUse1r(User user)
	{
		RedirectView vi=new RedirectView("../JSP/success.jsp");
		System.out.println("!!!!!!!");
		System.out.println(user);
		ModelAndView mav=new ModelAndView(vi);
		return mav;
		
	}
	
	
}