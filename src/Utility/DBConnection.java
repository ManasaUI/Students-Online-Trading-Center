package Utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection 
{
static Connection con=null;
public static Connection getConnection() throws ClassNotFoundException, SQLException
{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","studentsonlinetradingcenter","sots");
	return con;

}
}