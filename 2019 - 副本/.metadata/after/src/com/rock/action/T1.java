package com.rock.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/T1")
public class T1 extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String user=req.getParameter("uid");
		String pwd=req.getParameter("password");
		if(user.equals("father")&&pwd.equals("111111"))
		{
			System.out.println("��¼�ɹ�");
		}
		else 
			System.out.println("��¼ʧ��");
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("222222222");	}

	

}
