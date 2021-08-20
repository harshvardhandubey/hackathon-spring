<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
  <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
  <title>Start Exam</title>
  <link rel="stylesheet" type="text/css" href="gladiator.css">
  <script type="text/javascript" src="timer.js"></script>
</head>
  <div class="abc">
    <img src="logo4.jpg">
    <a href="">Home</a>
    <a href="">About Us </a>
    <a href="">Contact Us</a>
    <a href="logout.lti" style="float:right">Logout</a>
  </div>
  
<body bgcolor="#f1f1f1" >


  <h1>Instructions for Technical Test</h1>
  <ul class="instructions">
    <li>Quiz Time limit is 10 minutes.</li>
    <li>This Mock Test has 10 Questions.</li>
    <li>Each Question is of 1 marks so total 10 marks.</li>
    <li>Multiple Choice Questions with only ONE valid answer.</li>
    <li>Choose your answers to the questions and click 'Next' to see the next set of questions.</li>
    <li> You can skip questions if you would like and come back to them later.</li>
    <li> After your test click submit to see your results. Good luck!</li>
  </ul>
  <center>
    <form action="java.lti" method="post"><input type="submit" class="button button1" name="butn" value='Start Exam'></form>
  </center>

</body>

</html>