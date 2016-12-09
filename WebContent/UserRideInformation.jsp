<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Rideinformation</title>
<style>

#nav {
Width: 600px;
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
padding: 20px;
margin: 20px;

font-family: COMIC SANS MS;
}
</style>
</head>
<body bgcolor="#DCDCDC">
<div id="pic">
<img src="Images/sharepic.png" width="1350px" height="250px">
</div>

<div id="nav">

<ul>
<li><a href="/Students_Online_Trading_Center/AddRide.jsp"> Add Rides</a></li>
<li><a href="/Students_Online_Trading_Center/ViewRides.jsp">View Rides</a></li>

<li><input type="button" value="LOGOUT" onclick="logout()"></li>

</ul>

</div>


<script>
function logout()
{
	window.location="/Students_Online_Trading_Center/HomePage.jsp";
	}
</script>

</body>
</html>