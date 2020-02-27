<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	You are warm welcome Trainers.....
	<h3>Registration page</h3>
	<form action="add" method="post" autocomplete="off">
	Name :<input type="text" name="name" placeholder="Ajith"><br><br>
	Password:<input type="password" name="pass" placeholder="Ajith1234"><br><br>
	Email:<input type="email" name="email" placeholder="Ajith@hotmail.com"><br><br>
	Age:<input type="number" name="age" placeholder="42"><br><br>
	Subject:<input type="text" name="sub" placeholder="Java"><br><br>
	<input type="submit" value="Register">	
	</form>
	<a href="/logout">logout</a>
</body>
</html>