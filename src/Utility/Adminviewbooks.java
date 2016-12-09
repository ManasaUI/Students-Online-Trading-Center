
package Utility;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Adminviewbooks 
{
	DBConnection db=new DBConnection();
	public ArrayList getBookdetails() throws SQLException, ClassNotFoundException
	{
		ArrayList info=new ArrayList();
		Statement stmt=DBConnection.getConnection().createStatement();
		ResultSet rs=stmt.executeQuery("SELECT * FROM ");
		return info;
	}
	}


