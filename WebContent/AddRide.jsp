<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Addrideinformation</title>
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
table, th, td {
    border: 2px solid black;
    border-collapse: collapse;
    }
    th, td {
    padding: 5px;
    text-align: left;    
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


</ul>

</div>
<center><h2>Add Ride Information.......</h2></center>
<center>
<form action="/Students_Online_Trading_Center/AddRideDetails" method="post">
<table>
<tr>
<td>From</td><td><input type="text" name="from"></td>
</tr>
<tr>
<td>To</td><td><input type="text" name="to"></td>
</tr>
<tr>
<td>Date</td><td><input type="date" name="dateoftravel"></td>
</tr>
<tr>
<td>Time</td><td><input type="time" name="starttime"></td>
</tr>
<tr>
<td>Available For</td><td><input type="text" name="afor"></td>
</tr>
<tr>
<td>Contact Person Name</td><td><input type="text" name="cpname"></td>
</tr>
<tr>
<td>Phone Number</td><td><input type="text" name="pnumber"></td>
</tr>
</table><br><br>
<input type="submit" value="Add Ride" name="addride">
<input type="button" value="Cancel" name="cancelbutton" onclick="home()">
</form>
</center>

<script>
function home()
{
	window.location="/Students_Online_Trading_Center/UserHome.jsp";
	}
</script>

</body>
</html>