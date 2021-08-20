<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Select Exam</title>
<link rel="stylesheet" type="text/css" href="gladiator.css">
</head>
<div class="abc">
<img src="logo4.jpg">
  <a href="">Home</a>
  <a href="">About Us </a>
  <a href="">Contact Us</a>
	<a href="" style="float:right">Logout</a>
	  <h5 style="float:right; color:white; font-family:Arial">Hello, ${student.name}</h5>
</div>
<body bgcolor="#e6e6e6">
        <div id="containerIntro"><br>
                <h1>SELECT EXAM</h1>
                   </div><br>
                <div>
                  <hr><br><br><br>
    <center>
<form action="exam.lti" method="post"><input type="submit" class="button exam" name="butn" value='java'></form>
<form action="exam.lti" method="post"><input type="submit" class="button exam" name="butn" value='css'></form>
<form action="exam.lti" method="post"><input type="submit" class="button exam" name="butn" value='php'></form>
<form action="exam.lti" method="post"><input type="submit" class="button exam" name="butn" value='html'></form>
<form action="exam.lti" method="post"><input type="submit" class="button exam" name="butn" value='sql'></form>
<form action="exam.lti" method="post"><input type="submit" class="button exam" name="butn" value='javascript'></form>
</center>
        </div>
 </body>
</html>