<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <script type="text/javascript" src="comm/jquery-2.1.4.js"></script>
    <script type="text/javascript">
  		$(function() {
			$("#all").click(function() {
				var f=this.checked;
				$(":checkbox").prop("checked",f)	
				//alert(this.value)
			}
			
  		)
  			$("#b1").click(function() {
					var all=$("[name=cb]:checked")
					var herf="";
					var i;			
					if(all.length==0)
						{
						alert("未选中")
						return false;
						}
				for( i=0;i<all.length;i++)
					{
					herf=herf+all[i].value+',';
					
					}
				herf=herf.substring(0,herf.length-1)
				
				location.href="EmployeeAction?methon=deletesome&empno="+herf;
			})
  		})
    </script>
</head>
<body>
<fieldset>
<legend>欢迎${user.userid }</legend>
<table style="text-align: center;">
	<colgroup>
		<col width="10%">
		<col width="10%">
		<col width="10%">
		<col width="10%">
		<col width="10%">
		<col width="10%">
		<col width="10%">
		<col width="10%">
		<col width="10%">
		<col width="10%">
	</colgroup>
	<tr>
		<th><input type="checkbox"  id="all" >全选</th>
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
		<td><input   type="checkbox"  name="cb" value="${emp.empno}"></td>
		<td>${emp.empno}</td>
		<td>${emp.ename}</td>
		<td>${emp.job}</td>
		<td>${emp.mgr}</td>
		<td>${emp.hiredate}</td>
		<td>${emp.sal}</td>
		<td>${emp.comm}</td>
		<td>${emp.deptno}</td>
		<td><a href="EmployeeAction?methon=delete&empno=${emp.empno}">删除</a>
			<a href="EmployeeAction?methon=revision&empno=${emp.empno}">修改</a>
		</td>
	</tr>
	</c:forEach>
	<tr>
	<td colspan="10">
	<a herf="" id="b1">删除</a>
	<a herf="EmployeeAction?methon=find" id="b2">查找</a>
	<a>首页</a>
	<a>上一页</a>
	<label>x/y</label>
	<a>下一页</a>
	<a>尾页</a>
	</td>
	</tr>
</table>

</fieldset>
</body>
</html> 