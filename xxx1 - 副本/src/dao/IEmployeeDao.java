package dao;

import pojo.Employee;

public interface IEmployeeDao {
	public Employee queryByid(String empno);
}
