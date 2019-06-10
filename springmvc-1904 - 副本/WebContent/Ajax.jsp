<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	
	<%
		String path=this.getServletContext().getContextPath();
		pageContext.setAttribute("Path", path);
	
	%>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title></title>
	<script type="text/javascript" src="${Path}/comm/jquery-2.1.4.js"></script>
	
	<script type="text/javascript">
		$(function (){
			$('button').click(function() {
				$.get("json/emp1","",function (data)
						{
						$.each(data,function(index,ele){
							$('<div></div>').append(ele.userid).appendTo($('#cont'));
						})
					
					},'json');
			});
			});
	
	</script>
</head>
<body>
 	<button>checkempinfo</button>
 	<div id="cont">
 	
 	</div>
</body>
</html>