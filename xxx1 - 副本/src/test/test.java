package test;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import dao.IEmployeeDao;
import pojo.Employee;

public class test {
	public static void main(String[] args) throws IOException {
		SqlSession sqlSenssion =new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("NewFile.xml")).openSession(true);
	
		IEmployeeDao iEmployeeDao=sqlSenssion.getMapper(IEmployeeDao.class);
		Employee e=iEmployeeDao.queryByid("99");
		System.out.println(e);
	}

}
