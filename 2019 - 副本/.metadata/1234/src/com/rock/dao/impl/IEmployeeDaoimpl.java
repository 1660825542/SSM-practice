package com.rock.dao.impl;

import java.util.List;

import com.rock.dao.IEmployeeDao;
import com.rock.entities.Dept;
import com.rock.entities.Employee;
import com.rock.util.JDBCUtil;

public class IEmployeeDaoimpl implements IEmployeeDao{

	private JDBCUtil jdbc=null;
	public IEmployeeDaoimpl(){
		jdbc=new JDBCUtil();
	}
	public List<Employee> empall() {
		String sql="select * from emp";
		List<Employee> all=jdbc.queryAll(Employee.class, sql);
		return all;
	}

	@Override
	public int updateemp(Employee e) {
		String sql="update emp set ename=? , job=? , mgr=? , sal=? ,comm=? ,deptno=? where empno=?";
		int a=jdbc.runSql(sql,e.getEname(),e.getJob(),e.getMgr(),e.getSal(),e.getComm(),e.getDeptno(),e.getEmpno());
		return a;
	}

	@Override
	public int deleteemp(String e) {
		String sql="delete emp where empno=?";
		int a=jdbc.runSql(sql, e);
		return a;
	}
	@Override
	public Employee alertemp(String e) {
		String sql="select * from emp where empno=?";
		Employee a=jdbc.queryById(Employee.class, sql, e);
		return a;
	}
	@Override
	public List<Dept> alldept() {
		String sql="select * from dept";
		List<Dept> all=jdbc.queryAll(Dept.class, sql);
		return all;
	}
	@Override
	public int deletesome(String e) {
		String sql="delete from emp where empno in("+e+")";
		int a=jdbc.runSql(sql);
		
		return a;
	}

}
