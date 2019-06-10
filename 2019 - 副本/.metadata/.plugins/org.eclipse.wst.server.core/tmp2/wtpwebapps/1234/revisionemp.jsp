<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript" src="comm/jquery-2.1.4.js"></script>
<script type="text/javascript">
function check() {
	if(confirm("确认修改"))
		return true;
	else
		return false;
}



</script>

</head>
<body>
	<fieldset>
	<legend>修改信息</legend>
	<form action="EmployeeAction" onsubmit="return check()">
	<input type="hidden" name="methon" value="revisionemp">
	<input type="hidden" name="empno" value="${emp.empno}">
	<table>
		<tr><td>
		编号  ${emp.empno}</td>
		</tr>
		<tr>
			<td> 姓名 <input type="text" name="empname" value="${emp.ename}"></td>
		</tr>
		<tr>
			<td>工作 <input type="text" name="job"  value="${emp.job}"></td>
		</tr>		
		<tr>
			<td>领导 <select name="mgr">
				<c:forEach items="${emps}" var="e">
						<c:if test="${e.empno eq emp.mgr}">
								<option value="${e.empno}" selected="selected">${e.ename}</option>						
						</c:if>
						<c:if test="${e.empno ne emp.mgr}">
							<option value="${e.empno}">${e.ename}</option>						
						</c:if>
				</c:forEach>
				
				</select></td>
		</tr>
		<tr>
			<td>工资<input type="text" name="sal" value="${emp.sal}"></td>
		</tr>
		<tr>
			<td>月度奖金 <input type="text" name="comm" value="${emp.comm}"></td>
		</tr>
		<tr>
			<td>部门 <select name="deptno">
				<c:forEach items="${depts}" var="dept">
						<c:if test="${dept.deptno eq emp.deptno}">
								<option value="${dept.deptno}" selected="selected">${dept.dname}</option>						
						</c:if>
						<c:if test="${dept.deptno ne emp.deptno}">
							<option value="${dept.deptno}">${dept.dname}</option>						
						</c:if>
				</c:forEach>
				</select>
				</td>
		</tr>
		<tr><td>
		<input id="s1" type="submit" value="修改"></td>
		</tr>
	</table>
	</form>
	</fieldset>
</body>
</html>