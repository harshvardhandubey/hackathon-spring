<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Password Change</title>
<link rel="stylesheet" type="text/css" href="gladiator.css">

<script type="text/javascript">
    function Validate() {
        var password = document.getElementById("password").value;
        var confirmPassword = document.getElementById("confirm").value;
        if (password != confirmPassword) {
            alert("Passwords do not match.");
            document.getElementById("myBtn").disabled = true;
        }
        else
        	{
        	document.getElementById("myBtn").disabled = false;

        	}
    }
</script>

</head>
<body>
<div class="abc">
<img src="logo4.jpg">
<a href="index.jsp">Home</a>
<a href="about.jsp">About Us </a>
<a href="contact.jsp">Contact Us</a>
</div>
	<form action="changepwd.lti" method="post">
		<table>
		<tr>
				<td>Enter registered mail</td>
				<td>:</td>

				<td><input type="email" class="textfields" name="email"></td>
			</tr>
			<tr>
				<td><center>Security question</center></td></tr>
				<tr><td>Your current City</td>
				<td>:</td>

				<td><input type="text" class="textfields" name="city"></td>
			</tr>
			<tr><td>Your date of birth</td>
				<td>:</td>

				<td><input type="date" class="textfields" name="dob"></td>
			</tr>
			<tr>
				<td>New Password</td>
				<td>:</td>

				<td><input type="password" class="textfields" id="password" minlength="6" required></td>
			</tr>

			<tr>
				<td>Confirm Password</td>
				<td>:</td>

				<td><input type="password" class="textfields" name="password" id="confirm" minlength="6" onchange='Validate();' required></td>
			</tr>
			<tr>
				<td colspan=4><br></td>
			</tr>
			<tr>
				<td colspan=3 align="center"><input type="submit" class="button" value="Reset" id="myBtn" disabled>
			</tr>

		</table>
	</form>
</body>
</html>