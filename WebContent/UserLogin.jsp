<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Userloginpage</title>
<style>
#nav {
Width: 500px;
height: 50px;
margin-left: 400px;
}
li {
list-style: none;
display: inline;
}

a {

color: green;
font-size: 25px;
padding: 10px;
margin: 3px;
font-family: COMIC SANS MS;
}
#note {

color: red;
}
</style>
</head>
<body bgcolor="#DCDCDC">
<form action="/Students_Online_Trading_Center/UserLoginDetails" method="post">
<div id="note">
<center>
<h1>(UCM)-Students Online Trading Center</h1></center>
</div>
<div id="pic">
<img src="Images/share.jpg" width="1350px" height="250px">
</div>
<div id="nav">
<ul>
<li><a href="/Students_Online_Trading_Center/Aboutus.jsp">About Us</a></li>
<li ><a href="/Students_Online_Trading_Center/UserLoginPage.jsp"> User Login</a></li>
<li><a href="/Students_Online_Trading_Center/AdminLoginPge.jsp">Admin Login</a></li>

</ul>
</div>

<center>
<h2>Hello User....! Wel Come To Login</h2>
<table>
<tr><td>Email Address</td><td><input type="text" name="emailaddress"></td>
</tr>
<tr><td>Password</td><td><input type="password" name="pw"></td>
</tr>
</table><br>
<input type="submit" value="LOGIN">
<input type="button" value="CANCEL" onclick="Reg()"><br><br>
If you are a new User..!! please <a href="/Students_Online_Trading_Center/Userregform.jsp">REGISTER</a> here.

<script>
function Reg()
{
	window.location="/Students_Online_Trading_Center/HomePage.jsp";
	}
</script>

</center>
</form>
</body>
</html>