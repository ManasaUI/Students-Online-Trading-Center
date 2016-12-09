package Utility;

import java.sql.SQLException;
import java.sql.Statement;

public class AdminReg 
{
DBConnection db=new DBConnection();
public void setNewAdminReg(String fname,String lname,String dob,String pnumber,String add,String eaddress,String pword)
{
	try {
		System.out.println("INSERT INTO ADMINREGISTARTION VALUES('"+fname.trim()+"','"+lname.trim()+"','"+dob.trim()+"','"+pnumber.trim()+"','"+add.trim()+"','"+eaddress.trim()+"','"+pword.trim()+"') ");
		Statement stmt=DBConnection.getConnection().createStatement();
		stmt.executeUpdate("INSERT INTO ADMINREGISTARTION VALUES('"+fname.trim()+"','"+lname.trim()+"','"+dob.trim()+"','"+pnumber.trim()+"','"+add.trim()+"','"+eaddress.trim()+"','"+pword.trim()+"')");
		
		
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
}