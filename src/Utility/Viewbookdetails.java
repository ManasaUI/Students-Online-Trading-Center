package Utility;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Viewbookdetails 
{
	DBConnection db=new DBConnection();
	public ArrayList viewBooks() throws ClassNotFoundException, SQLException
	{
		ArrayList info=new ArrayList();
		Statement stmt=DBConnection.getConnection().createStatement();
		ResultSet rs=stmt.executeQuery("select * from ADMINADDBOOKS");
		if(rs.next())
		{
			info.add(rs.getString(1));
			info.add(rs.getString(2));
			info.add(rs.getString(3));
			info.add(rs.getString(4));
			info.add(rs.getString(4));
			
			
		}
		
		return info;
		
	}
	

}
