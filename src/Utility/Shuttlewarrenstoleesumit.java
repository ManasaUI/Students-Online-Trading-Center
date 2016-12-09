package Utility;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Shuttlewarrenstoleesumit 
{
	DBConnection db=new DBConnection();
	public ArrayList getWarrenstoleesumit() throws ClassNotFoundException, SQLException
	{
		ArrayList info=new ArrayList();
		Statement stmt=DBConnection.getConnection().createStatement();
		ResultSet rs=stmt.executeQuery("SELECT monday, tuesday, wednesday, thursday, friday, saterday FROM WARRENSTOLEESUMMIT");
		
		if(rs.next())
		{
			info.add(rs.getString(1));
			info.add(rs.getString(2));
			info.add(rs.getString(3));
			info.add(rs.getString(4));
			info.add(rs.getString(5));
			info.add(rs.getString(6));
	
			
		}
		
		return info;
	}
	

}
