<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<fieldset>
<legend>检索</legend>
<form action="">
<div>
	姓名关键字<input type="text" name="ename">
</div>
<div>
	job关键字<input type="text" name="job">                                                                                                                                                                                                                                                                                                                                                                                                                                                                      
</div>
<div>
	部门<select>
		<option value="0">可选择部门</option>	
		<c:forEach items="${depts}" var="dept"></c:forEach>
	</select>

</div>
</form>
</fieldset>
</body>
</html>