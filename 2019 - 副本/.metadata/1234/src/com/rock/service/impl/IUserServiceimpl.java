package com.rock.service.impl;

import com.rock.dao.IUserDao;
import com.rock.dao.impl.IUserDaoimpl;
import com.rock.entities.User;
import com.rock.service.IUserService;

public class IUserServiceimpl  implements IUserService{
	private IUserDao iud=null;
	public IUserServiceimpl(){
		iud=new IUserDaoimpl();
	}
	public User userlogin(User user) {
		
		return iud.userlogin(user);
	}

	

}
