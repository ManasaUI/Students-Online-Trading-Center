<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Userhomepage</title>
<style>

#nav {
Width: 1150px;
height: 30px;
margin-left: 125px;


}

li {
list-style: none;
display: inline;
}

a {

color: green;
font-size: 20px;
padding: 5px;
margin: 5px;

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
<li><a href="/Students_Online_Trading_Center/UserViewDetails.jsp">View Details</a></li>
<li><a href="/Students_Online_Trading_Center/ShuttleInformation.html">Shuttle Information</a></li>
<li><a href="/Students_Online_Trading_Center/UserRideInformation.jsp">Ride Information</a></li>
<li><a href="/Students_Online_Trading_Center/UserSellingProducts.jsp">Selling Products</a></li>
<li><a href="/Students_Online_Trading_Center/UserAccFacilities.jsp">Accommodation Facilities</a></li>
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