package Utility;

import java.sql.SQLException;
import java.sql.Statement;

public class AddingRides 
{
	DBConnection db=new DBConnection();
	public void addRide(String fm, String t,String doft, String stime,String availablefor,String cname,String pnum) throws ClassNotFoundException, SQLException
	{
		System.out.println("I am in add ride method");
		Statement stmt=DBConnection.getConnection().createStatement();
		System.out.println("INSERT INTO ADDINGRIDES VALUES('"+fm.trim()+"','"+t.trim()+"','"+doft.trim()+"','"+stime.trim()+"','"+availablefor.trim()+"','"+cname.trim()+"','"+pnum.trim()+"')");
		int i=stmt.executeUpdate("INSERT INTO ADDINGRIDES VALUES('"+fm.trim()+"','"+t.trim()+"','"+doft.trim()+"','"+stime.trim()+"','"+availablefor.trim()+"','"+cname.trim()+"','"+pnum.trim()+"')");
		System.out.println(i);
		
	}
}
