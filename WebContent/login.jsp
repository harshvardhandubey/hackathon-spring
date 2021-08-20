<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>

<link rel="stylesheet" type="text/css" href="gladiator.css">
</head>
<body>
<div class="abc">
<img src="logo4.jpg">
  <a href="index.jsp">Home</a>
  <a href="about.jsp">About Us </a>
  <a href="contact.jsp">Contact Us</a>
</div>
	<h3>
		Don't have an account?  <a href="registration.jsp">Register here.</a>
	</h3>
	<form action="login.lti">
		<table>
		<tr>
		<td colspan=3 align="center" style="color:red">${invalid}</td>
		</tr>
			<tr>
				<td>E-mail id</td>
				<td>:</td>

				<td><input type="email" class="textfields" name="email"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td>:</td>
				<td><input type="password" class="textfields" name="password"></td>
			</tr>
				<td colspan=2></td>
				<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <a href="forgot.jsp" style="font-size: 15px;">Forgot Password</a>

				</td>
			</tr>
			<tr>
				<td colspan=4><br></td>
			</tr>
			<tr>
				<td colspan=3 align="center"><input type="submit" class="button" value="LOGIN">
			</tr>
			
			<tr>
		
				<td colspan=3 align="center"><a href="adminlogin.jsp" class="button1">Login as admin</a>
				
			</tr>

		</table>
	</form>
</body>
</html>