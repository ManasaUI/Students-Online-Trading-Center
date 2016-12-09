<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
table, th, td {
    border: 2px solid black;
    border-collapse: collapse;
}
th, td {
    padding: 5px;
    text-align: left;    
}
#nav{
Width: 500px;
height: 50px;
margin-left: 400px;

}
li{
list-style: none;
display: inline;
}

a {

color: Green;
font-size: 25px;
padding: 20px;
margin: 20px;
font-family: COMIC SANS MS;
}
</style>
</head>
<body>
<div id="bookpic">
<img src="Images/books.jpg" width="1350px" height="250">
</div>
<div id="nav">
<ul>
<li ><a href="/Students_Online_Trading_Center/Adminaddingbooks.jsp">Adding Books</a></li>
<li><a href="/Students_Online_Trading_Center/AdminViewBooks.jsp">View Books</a></li>
</ul>
</div>
<center>
<table>

<%

ArrayList infoGot =(ArrayList) request.getAttribute("info");
	

int count = 0;
int j;

%>
<tr>
<td>ISBN Number</td>
<td>Book Name</td>
<td>Author Name</td>
<td>Edition</td>
<td>Number of Books</td>
<%
	for(j=0; j<4;j++)	
{
	 %>
	<td><%= infoGot.get(count)%></td>
	<%count  = count+1; %>

	
	
<%} %>

</table>

</center>

</body>
</html>