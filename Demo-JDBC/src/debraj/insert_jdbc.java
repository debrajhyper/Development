package debraj;

import java.sql.*;
import java.io.*;

public class insert_jdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException, IOException {
		
				//load the driver
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				
				//creating a connection
				String url = "jdbc:mysql://localhost:3306/jdbc";
				String username = "root";
				String password = "Debraj@1234";
				
				Connection c = DriverManager.getConnection(url,username,password); 
				
				
				//create a query
				String i = "insert into table1(name,city) values(?,?)";
				
				
				//get the PreparedStatement object
				PreparedStatement pstmt = c.prepareStatement(i);
				
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				System.out.println("Enter name : ");
				String name = br.readLine();
				
				System.out.println("Enter city : ");
				String city = br.readLine();
				
				
				//set the values to query
				pstmt.setString(1,name);
				pstmt.setString(2,city);
				
				pstmt.executeUpdate();
				System.out.println("inserted into database...");
				
				c.close();

	}

}
