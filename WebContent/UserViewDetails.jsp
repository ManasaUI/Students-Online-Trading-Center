<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Userviewdetails</title>
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
<% String email = (String)session.getAttribute("email");
String pwrd = (String)session.getAttribute("pass");

System.out.println("I am"+email+"and "+pwrd);

Object infoGot = session.getAttribute("information");

ArrayList cc= (ArrayList)infoGot;

for(Object s:cc)
{
	System.out.println(s.toString());
}

%>
<form action="/Students_Online_Trading_Center/UserUpdateDetails" method="post">

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
<center><h2> Hello Your Details are.....</h2></center>
<center>
<table>
<tr>
<td>First Name</td><td><input type="text" value ="<%=cc.get(0).toString()%>" name="firstname"  readonly="readonly" id = "firstname"></td>
</tr>
<tr>
<td>Last Name</td><td><input type="text" value ="<%=cc.get(1).toString()%>" name= "lastname" readonly="readonly" id="lastname"></td>
</tr>
<tr>
<td>Date Of Birth</td><td><input type="date" name="dateofbirth" value ="<%=cc.get(2).toString()%>" readonly="readonly" id = "dateofbirth"></td>
</tr>
<tr>
<td>Phone Number</td><td><input type="text" name="phonenumber" value ="<%=cc.get(3).toString()%>" readonly="readonly" id = "phonenumber"></td> 
</tr>
<tr>
<td>Address</td><td><input type="text" name="address" value ="<%=cc.get(4).toString()%>" readonly="readonly" id = "address"> </td>
</tr>
<tr>
<td>Email Adderss</td><td><input type="text" name="emailaddress" value ="<%=cc.get(5).toString()%>" readonly="readonly" id = "emailaddress"> </td>
</tr>
<tr>
<td>Password</td><td><input type="text" name="pw" value ="<%=cc.get(6).toString()%>" readonly="readonly" id = "pw"></td>
</tr>
</table><br><br>
<input type="button" value="Edit" onclick="makeEdit()">
<input type="submit" value="Update"> <p id="updateinfo"> </p>
</center></form>
 

<script type="text/javascript">

function makeEdit()
{
	
	document.getElementById("firstname").removeAttribute('readonly');
	document.getElementById("lastname").removeAttribute('readonly');
	document.getElementById("dateofbirth").removeAttribute('readonly');
	document.getElementById("phonenumber").removeAttribute('readonly');
	document.getElementById("address").removeAttribute('readonly');
	document.getElementById("pw").removeAttribute('readonly');

}

</script>
<script>
function logout()
{
	window.location="/Students_Online_Trading_Center/HomePage.jsp";
	}
</script>

</body>
</html>