package chaitra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ExecuteUpdate {

		public static void main(String[] args) throws SQLException {
			Connection con = null;
			
			Driver driverRef = new Driver();
			
			// Step 1: Register to the database
			DriverManager.registerDriver(driverRef);
			
			// Step 2: Get connection to the database
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/overlord", "root", "root");
			
			// Step 3: Issue create statement
			Statement stat = con.createStatement();
			 
			// Step 4: Execute query
			int result = stat.executeUpdate("insert into Empire values(999, 'Bill', 'Civil', 665511)");
			System.out.println(result);
			
			if(result==1)
			{
				System.out.println("Query Executed");
			}
			else
				System.out.println("Query Failed");
			
			// Step 5: Close the connection
			con.close();
		}
	}
