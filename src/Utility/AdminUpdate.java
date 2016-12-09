package Utility;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AdminUpdate 
{
DBConnection db=new DBConnection();
public void updateAdmindetails(String fname,String lname,String dob,String pnumber,String add,String eaddress,String pword)
{
	try
	{
		
	Statement stmt=DBConnection.getConnection().createStatement();
	int i=stmt.executeUpdate("UPDATE ADMINREGISTARTION SET firstname='"+fname.trim()+"', lastname='"+lname.trim()+"',dateofbirth='"+dob.trim()+"',phonenumber='"+pnumber.trim()+"', address='"+add.trim()+"',password='"+pword.trim()+"'where emailaddress= '"+eaddress.trim()+"'");
	System.out.println("UPDATE  ADMINREGISTARTION sSET firstname='"+fname.trim()+"', lastname='"+lname.trim()+"',dateofbirth='"+dob.trim()+"',phonenumber='"+pnumber.trim()+"', address='"+add.trim()+"',password='"+pword.trim()+"'where emailaddress='"+eaddress.trim()+"'");
	System.out.println("The I value is" +i);
	}	
	catch (ClassNotFoundException | SQLException e) 
	{
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
