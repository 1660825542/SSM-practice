package com.rock.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.rock.entities.Dept;
import com.rock.entities.Employee;
import com.rock.service.IEmployeeService;
import com.rock.service.impl.IEmployeeServiceimpl;

/**
 * Servlet implementation class EmployeeAction
 */
@WebServlet("/EmployeeAction")
public class EmployeeAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
    IEmployeeService ies=null;
   
    public EmployeeAction() {
       
      ies=new IEmployeeServiceimpl();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String methon=request.getParameter("methon");
		if("login".equals(methon))
		{		
			this.empall(request, response);
		}
		else if("delete".equals(methon))
		{
			this.delete(request, response);
		}
		else if("revision".equals(methon))
		{
			this.revision(request, response);
		}
		else if("revisionemp".equals(methon))
		{			
			this.revisionemp(request, response);
		}
		else if("deletesome".equals(methon))
		{
			this.deletesome(request, response);
		}
		else if("find".equals(methon))
		{
			this.find(request, response);
		}
		else
			this.empall(request, response);
		
	}
	protected void find(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Dept> dall=ies.alldept();
		request.setAttribute("depts", dall);
		request.getRequestDispatcher("/FIndemp.jsp").forward(request, response);
	}
	protected void deletesome(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empnos=request.getParameter("empno");
		int a=ies.deletesome(empnos);
		if(a>0)
		{
			request.getRequestDispatcher("EmployeeAction?methon=login").forward(request, response);
		}
		else
			System.out.println("222");
	}
	protected void revisionemp(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Employee e=new Employee();
		e.setEmpno(request.getParameter("empno"));
		e.setEname(request.getParameter("empname"));
		e.setJob(request.getParameter("job"));
		e.setMgr(request.getParameter("mgr"));
		e.setSal(request.getParameter("sal"));
		e.setComm(request.getParameter("comm"));
		e.setDeptno(request.getParameter("deptno"));
		int a=ies.updateemp(e);
		System.out.println(a);
		if(a>0)
		{
			request.getRequestDispatcher("EmployeeAction?methon=login").forward(request, response);
		}
		else
			System.out.println("22");
	}
	protected void revision(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empno=request.getParameter("empno");
		Employee e=ies.alertemp(empno);
		List<Dept> deptall=ies.alldept();
		List<Employee> empall=ies.empall();
		
		request.setAttribute("emps", empall);
		request.setAttribute("emp", e);
		request.setAttribute("depts", deptall);
		request.getRequestDispatcher("revisionemp.jsp").forward(request, response);
	}
	protected void delete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String empno=request.getParameter("empno");
		
		int a=ies.deleteemp(empno);
		if (a>0)
		{			
			request.getRequestDispatcher("EmployeeAction?methon=login").forward(request, response);
		}
}
	protected void empall(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession s=request.getSession(true);
		request.setAttribute("user", s.getAttribute("user"));
		List<Employee> empall=ies.empall();
		request.setAttribute("emps", empall);
		request.getRequestDispatcher("main.jsp").forward(request, response);
	}

}
