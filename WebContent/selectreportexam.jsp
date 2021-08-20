<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="gladiator.css">
</head>
<body bgcolor="#f1f1f1">
<div class="abc">
<img src="logo4.jpg">

<a href="">Home</a>
  <a href="">About Us </a>
  <a href="">Contact Us</a>
	<a href="" style="float:right">Logout</a>
	     <h5 style="float:right; color:white; font-family:Arial">Hello, ${name}</h5>
</div>
<form action="report.lti" method="post">
<center><select name="examreport" class="examsel">
									<option value="java">Java</option>
									<option value="css">CSS</option>
									<option value="sql">SQL</option>
									<option value="php">PHP</option>
									<option value="javascript">Javascript</option>
									<option value="html">HTML</option>
								</select></center>
<center><input type="submit" value="Display Report" class="button"></center>
								</form>
</body>
</html>