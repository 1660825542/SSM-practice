<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
 <a href="user/login">login</a>
 
 <fieldset>
 	<legend>post</legend>
 	<form action="user/login" method="post">
 		<input type="text" value="11" name="userid">
 		<input type="password" value="22" name="password">
 		<input type="submit" value="tijiao">
 	</form>
 </fieldset>
  <fieldset>
 	<legend>put</legend>
 	<form action="user/put" method="post">
 		<input type="hidden" name="_method" value="PUT">
 		<input type="text" value="11" name="userid">
 		<input type="password" value="22" name="password">
 		<input type="submit" value="tijiao">
 	</form>
 </fieldset>
  <fieldset>
 	<legend>delete</legend> 
 	<form action="user/delete" method="post">
 		<input type="hidden" name="_method" value="DELETE">
 		<input type="text" value="11" name="userid">
 		<input type="password" value="22" name="password">
 		<input type="submit" value="tijiao">
 	</form>
 </fieldset>
</body>
</html>