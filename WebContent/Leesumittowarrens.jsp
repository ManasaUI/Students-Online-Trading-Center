<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
table, th, td {
    border: 2px solid black;
    border-collapse: collapse;
}
th, td {
    padding: 5px;
    text-align: left;    
}
#note{
color: green;
}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Leesumittowarrens</title>
</head>
<body bgcolor="#E6E6FA">
<% 
Object infoGot = request.getAttribute("info");
ArrayList cc=(ArrayList) infoGot;
System.out.println(cc);
/* 
for(Object s : cc)
//	for(int i=0; i<cc.size();i++)
{
	System.out.println(s.toString());
}
 */
%>
<div id="secondpic">
				<img src="Images/shuttle.jpg" width="1350px"  height="300px"alt="roomshare picture"/>
			</div ><br>
			<center>
<div id="note">	

<h2>Lee'Sumit To Warrensburg Shuttle Information</h2><br>
</div>
<table>
<tr>
<th>Days</th>
<th>Timmings</th>
</tr>
<tr>
<td>Monday</td><td><%=cc.get(0).toString()%></td>
</tr>
<tr>
<td>Tuesday</td><td><%=cc.get(1).toString() %></td>
</tr>
<tr>
<td>Wednesday</td><td><%=cc.get(2).toString() %> </td>
</tr>
<tr>
<td>Thursday</td> <td> <%=cc.get(3).toString() %> </td>

</tr>
<tr>
<td>Friday</td><td><%=cc.get(4).toString() %></td>
</tr>
<tr>
<td>Saturday</td><td><%=cc.get(5).toString() %></td>
</tr>


</table>
</center>

</body>
</html>