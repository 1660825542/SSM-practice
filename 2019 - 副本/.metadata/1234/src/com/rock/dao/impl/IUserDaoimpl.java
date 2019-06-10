package com.rock.dao.impl;

import com.rock.dao.IUserDao;
import com.rock.entities.User;
import com.rock.util.JDBCUtil;

public class IUserDaoimpl implements IUserDao{
	private JDBCUtil jdbc=null;
	 public IUserDaoimpl() {
		jdbc=new JDBCUtil();
	}
	@Override
	public User userlogin(User user) {
		String sql="select * from userinfo where userid=? and user_password=?";
		User u=jdbc.queryById(User.class, sql,user.getUserid(),user.getPassword());
		return u;
	}

}
