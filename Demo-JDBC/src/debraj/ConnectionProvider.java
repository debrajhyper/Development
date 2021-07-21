package debraj;

import java.sql.*;

public class ConnectionProvider {
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException {
		
				
				//load the driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				
				
				//creating a connection
				String url = "jdbc:mysql://localhost:3306/jdbc";
				String username = "root";
				String password = "root";
				
				Connection c = DriverManager.getConnection(url,username,password);
				
				System.out.println("Connection Created...");
			
		
		return c;
		
	}
	

}
