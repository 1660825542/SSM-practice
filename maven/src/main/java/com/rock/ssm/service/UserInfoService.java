package com.rock.ssm.service;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.rock.ssm.dao.UserinfoMapper;
import com.rock.ssm.entities.Message;
import com.rock.ssm.entities.Userinfo;

/**
 * FileName		:com.rock.ssm.service 	UserinfoService.java
 * TODO			:
 * Copyright	:Copyright (c) 2015-2016 All Rights Reserved. Company: 01skill-soft.com Inc.
 * @author: 	:老张
 * @Date		:2019年4月27日:下午4:51:37
 * @version 	:1.0
 * 
 *           Modification History: Date			Author 		Version 	Description
 *           ----------------------------------------------------------------------
 *           					   2019年4月27日 	老张 			1.0 		1.0 Version
 * 
 */
@Service
public class UserInfoService {
	@Autowired
	private UserinfoMapper userinfoMapper;
	
	public Message queryAll(String pageNum){
		
		PageHelper.startPage(Integer.parseInt(pageNum),8);
		List<Userinfo> all=userinfoMapper.selectByExampleWithUserlevel(null);
		PageInfo<Userinfo> pageInfo=new PageInfo<>(all,5);	
//		System.out.println(pageInfo.getList());
		return Message.success().add("pageInfo",pageInfo); 
}
}
