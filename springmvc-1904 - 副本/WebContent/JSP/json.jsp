<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title></title>
</head>
<body>
	78979789798
	<c:forEach items="${users}" var="user">
		<div>
			${user}
		</div>
	</c:forEach>
</body>
</html>