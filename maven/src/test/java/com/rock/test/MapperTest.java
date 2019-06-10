package com.rock.test;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.rock.ssm.dao.UserinfoMapper;
import com.rock.ssm.dao.UserlevelMapper;
import com.rock.ssm.entities.Userinfo;
import com.rock.ssm.entities.Userlevel;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring.xml"})
public class MapperTest {
	
	@Autowired
	UserinfoMapper userinfoMapper;
	@Autowired
	UserlevelMapper userlevelMapper;
	@Autowired
	SqlSession sqlSession;
	@Test
	public void testInsert()
	{
		Userlevel userlevel=new Userlevel();
		userlevel.setLevelname("°×½ð");
		userlevel.setLeveltxt("999999");
		userlevelMapper.insert(userlevel);
	}
	@Test
	public void testuserinfo()
	{
		for(int i=0;i<300;i++)
		{
		Userinfo userinfo=new Userinfo();
		userinfo.setUsername("sb"+i);
		if(i%3==0)
		userinfo.setSex("M");
		else
			userinfo.setSex("F");
		userinfo.setEmail("123"+i+"123456@qq.com");
		if(i%2==0)
		userinfo.setLevelid(1);
		else
			userinfo.setLevelid(2);
		userinfoMapper.insert(userinfo);				
		}
	}
	
	
}
