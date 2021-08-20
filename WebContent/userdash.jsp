<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
    <c:set var = "contextPath" value="${pageContext.request.contextPath}"/>
<!DOCTYPE html>
<html>
<head>
	<title>Homepage</title>
<link rel="stylesheet" type="text/css" href="gladiator.css">
</head>

<body bgcolor="#f1f1f1">
<div class="abc">
<img src="logo4.jpg">
  <a href="">Home</a>
  <a href="">About Us </a>
  <a href="">Contact Us</a>
  <a href="" style="float:right">Hello, ${student.name}</a>
   <a href="${contextPath}/logout.lti" style="float:right">Logout</a>
</div>
<br><br><br>

<center>
<div class="homepage">  

<form action="selectreportexam.jsp" method="post"><input type="submit" class="button" name="butn" value='View Report'></form>
<br><br><br>
<form action="selectexam.jsp" method="post"><input type="submit" class="button" name="butn" value='New Exam'></form></div>
</center>



</body>
</html>