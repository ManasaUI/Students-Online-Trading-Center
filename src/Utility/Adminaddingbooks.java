package Utility;

import java.sql.SQLException;
import java.sql.Statement;

public class Adminaddingbooks 
{
	DBConnection db=new DBConnection();
	public void addNewbooks(String isbnnum, String bname,String aname, String ed,String nofb) throws ClassNotFoundException, SQLException
	{
		Statement stmt=DBConnection.getConnection().createStatement();
		stmt.executeUpdate("INSERT INTO ADMINADDBOOKS VALUES('"+isbnnum.trim()+"','"+bname.trim()+"','"+aname.trim()+"','"+ed.trim()+"',"+Integer.parseInt(nofb)+")");
		
	}

}
