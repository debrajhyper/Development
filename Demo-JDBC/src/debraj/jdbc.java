package debraj;

import java.sql.*;

public class jdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//load the driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
		//creating a connection
		String url = "jdbc:mysql://localhost:3306/jdbc";
		String username = "root";
		String password = "root";
		
		Connection c = DriverManager.getConnection(url,username,password); 
		
		/*if(c.isClosed()) {
			System.out.println("Connection is closed");
		}else {
			System.out.println("Connection Created...");
		}*/
		
		
		//create a query
		String q = "create table table2(id int(20) primary key auto_increment,name varchar(50) not null, city varchar(100))";
		
		
		//create a statement
		Statement stem = c.createStatement();
		stem.executeUpdate(q);
		System.out.println("table created in database...");
			
		c.close();
		
	}

}
