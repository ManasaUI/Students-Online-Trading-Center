<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Userregform</title>
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
table, th, td {
    border: 2px solid black;
    border-collapse: collapse;
}
th, td {
    padding: 5px;
    text-align: left;    
}
</style>
</head>
<body bgcolor="#DCDCDC">
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
<center><h2>Hello Admin...!! Please Register Here..</h2></center>
<form action="/Students_Online_Trading_Center/UserRegDetails" method="post">
<center>
<table>
<tr><td>First Name</td><td><input type="text" name="firstname"></td>
<tr>
<td>Last Name</td><td><input type="text" name = "lastname"></td>
</tr>
<tr>
<td>Date Of Birth</td><td><input type="date" name="dateofbirth"></td>
</tr>
<tr>
<td>Phone Number</td><td><input type="text" name="phonenumber"></td> 
</tr>
<tr>
<td>Address</td><td><input type="text" name="address"> </td>
</tr>
<tr>
<td>Email Address</td><td><input type="text" name="emailaddress"> </td>
</tr>
<tr>
<td>Password</td><td><input type="password" name="pw" ></td>
</tr>
</table><br><br>
<input type="submit" value="Submit" name="button">
<input type="button" value="Cancel" onclick="homepage()"><br><br>
If you are Rigistered user then goto <a href="/Students_Online_Trading_Center/UserLogin.jsp">LOGIN </a>
</center>
<script>
function homepage()
{
	window.location="/Students_Online_Trading_Center/HomePage.jsp";
	}
</script>
</form>

</body>
</html>