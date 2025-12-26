package genericUtility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.WebDriver;

import com.mysql.cj.jdbc.Driver;

public class DBUtility {
	Connection conn=null;
	/**
	 * This is used to create and register and get DB connection
	 * @throws SQLException
	 */
	public void createDriverandRegisterDB() throws SQLException
	{
		//Register the DB
		Driver driver=new Driver();
		DriverManager.registerDriver(driver);
		
		//get the connection to DB
		Connection conn=DriverManager.getConnection(IPathStatics.dbUrl,IPathStatics.username,IPathStatics.password);
	}
	
	/**
	 * This is used to executes the query
	 * @param query
	 * @return
	 * @throws SQLException
	 */
	public ResultSet executeQuery(String query) throws SQLException
	{
		//create statement
		Statement stmt=conn.createStatement();
		
		//execute query
		ResultSet res=stmt.executeQuery(query);
		return res;
	}
	
	/**
	 * This is used to update the DB
	 * @param query
	 * @return
	 * @throws SQLException
	 */
	public int updateQuery(String query) throws SQLException
	{
		//create stmt
		Statement stmt=conn.createStatement();
		int res=stmt.executeUpdate(query);
		return res;
	}
	
	/**
	 * This is used to close the DB connection
	 * @throws SQLException
	 */
	public void disconnectDB() throws SQLException
	{
		//close the DB connection
		conn.close();
	}
}
