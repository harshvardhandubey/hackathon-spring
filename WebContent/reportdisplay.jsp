<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
	     <h5 style="float:right; color:white; font-family:Arial">Hello, ${studname}</h5>
</div>
<div class="space">
<h1> </h1>
</div>
<div class="report">
<h2>${studname}</h2>
<h2>${studtype}</h2>
<h2>${studresult}</h2>

<button class="button proceed"><a href="userdash.jsp" class="reportdisp" style=" text-decoration: none;"> Go back to Homepage </a></button>
<br><br><br><br>

</div>
</body>
</html>