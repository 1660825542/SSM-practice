package com.rock.service;

import java.util.List;

import com.rock.entities.Dept;
import com.rock.entities.Employee;

public interface IEmployeeService {
	
	public List<Employee> empall();
	public int updateemp(Employee e);
	public int deleteemp(String e);
	public Employee alertemp(String e);
	public List<Dept> alldept();
	public int deletesome(String e);
}
