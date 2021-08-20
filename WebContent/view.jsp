<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="gladiator.css">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="view.lti">
		<table>
		<tr>
		<td><h1>View Student's report</h1></td>
		</tr>
		<tr>
		<td colspan=3 align="center" style="color:red">${invalid}</td>
		</tr>
			<tr>
				<td>Student's name</td>
				<td>:</td>
				
				<td><input type="text" class="textfields" name="name"></td>
			</tr>
			<tr>
				<td>Technology</td>
				<td>:</td>
				<td><select required class="textfields" name="examtype">
  				<option value="java">Java</option>
  				<option value="css">CSS</option>
  				<option value="php">PHP</option>
  				<option value="html">HTML</option>
  				<option value="sql">SQL</option>
  				<option value="javascript">JavaScript</option>
		</select></td>
			</tr>
			<tr>
				<td colspan=4><br></td>
			</tr>
			<tr>
				<td colspan=3 align="center"><input type="submit" class="button" value="View Report">
			</tr>

		</table>
	</form>
</body>
</html>