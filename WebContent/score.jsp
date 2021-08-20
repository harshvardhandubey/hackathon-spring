<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" import="com.lti.controller.StudentController "%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reset Password</title>
<link rel="stylesheet" type="text/css" href="gladiator.css">
</head>
<body>
<div class="abc">
<img src="logo4.jpg">

<a href="">Home</a>
  <a href="">About Us </a>
  <a href="">Contact Us</a>
  	<a href="" style="float:right">Logout</a>
  	  <h5 style="float:right; color:white; font-family:Arial">Hello, ${name}</h5>
</div>
<div class="space">
<h1> </h1>
</div>
<div class="result">
<h4>Name: ${name} </h4>
<h4>Test: ${exam} </h4>
<h4>Score: ${count} </h4>
<h4>Result: ${result}</h4>

<center><form action="proceed.lti" method="post"><input type="submit" class="button exam" name="butn" value='Next'></form></center>

</div>
</body>
</html>