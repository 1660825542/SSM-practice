<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script type="text/javascript" src="comm/jquery-2.1.4.js"></script>
    <script type="text/javascript">
    $(document).ready(function () {
        $("a").click(function () {
            alert("1111")
        })
    })
    
    
    </script>
</head>
<body>
<fieldset>
<legend>欢迎${user.userid }</legend>
<table style="text-align: center;">
	<colgroup>
		<col width="11%">
		<col width="11%">
		<col width="11%">
		<col width="11%">
		<col width="11%">
		<col width="11%">
		<col width="11%">
		<col width="11%">
		<col width="11%">
	</colgroup>
	<tr>
		<th>编号</th>
		<th>姓名</th>
		<th>工作</th>
		<th>领导</th>
		<th>出生日期</th>
		<th>工资</th>
		<th>月度奖金</th>
		<th>部门</th>	
		<th>操作</th>
	</tr>
	<c:forEach items="${emps}" var="emp">
	<tr>
		<td>${emp.empno}</td>
		<td>${emp.ename}</td>
		<td>${emp.job}</td>
		<td>${emp.mgr}</td>
		<td>${emp.hiredate}</td>
		<td>${emp.sal}</td>
		<td>${emp.comm}</td>
		<td>${emp.deptno}</td>
		<td><a href="EmployeeAction?methon=delete&empno=${emp.empno}">删除</a></td>
	</tr>
	</c:forEach>
</table>

</fieldset>
</body>
</html> 