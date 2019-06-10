package com.rock.springmvc.action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rock.springmvc.entities.User;

@Controller
@RequestMapping("/json")
public class JsonAction {

	private List<User> all=new ArrayList<>();
	{
		all.add(new User("����"));
		all.add(new User("����"));
		all.add(new User("��үү"));
		all.add(new User("ɵ��"));
	}
	
	@RequestMapping("/emp")
	public String getEmp(Map<String,Object> request)
	{
		
		request.put("users",all);
		return "json";
	}
	@ResponseBody
	@RequestMapping("/emp1")
	public List<User> getEmp1()
	{
		
		return all;
	}
	
	@ResponseBody
	@RequestMapping("/emp2")
	public Map<String,User> getEmp2()
	{
		Map<String,User> map=new HashMap<>();
		map.put("1", new User("����"));
		map.put("2", new User("����"));
		map.put("3", new User("�ŷ�"));
		return map;
	}
	
	@ResponseBody
	@RequestMapping("/emp3")
	public User getEmp3()
	{
		
		return new User("�ŷ�");
	}
}
