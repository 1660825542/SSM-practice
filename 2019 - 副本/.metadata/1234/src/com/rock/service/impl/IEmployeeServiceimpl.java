package com.rock.service.impl;

import java.util.List;

import com.rock.dao.IEmployeeDao;
import com.rock.dao.impl.IEmployeeDaoimpl;
import com.rock.entities.Dept;
import com.rock.entities.Employee;
import com.rock.service.IEmployeeService;

public class IEmployeeServiceimpl implements IEmployeeService{

	private IEmployeeDao ied=null;
	public IEmployeeServiceimpl(){
		ied=new IEmployeeDaoimpl();
	}
	public List<Employee> empall() {
		// TODO Auto-generated method stub
		return ied.empall();
	}

	@Override
	public int updateemp(Employee e) {
		// TODO Auto-generated method stub
		return ied.updateemp(e);
	}

	@Override
	public int deleteemp(String e) {
		// TODO Auto-generated method stub
		return ied.deleteemp(e);
	}
	@Override
	public Employee alertemp(String e) {
		// TODO Auto-generated method stub
		return ied.alertemp(e);
	}
	@Override
	public List<Dept> alldept() {
		// TODO Auto-generated method stub
		return ied.alldept();
	}
	@Override
	public int deletesome(String e) {
		// TODO Auto-generated method stub
		return ied.deletesome(e);
	}

}
