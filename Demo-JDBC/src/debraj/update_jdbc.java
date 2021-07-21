package debraj;

import java.io.*;
import java.sql.*;

public class update_jdbc {

	public static void main(String[] args) throws SQLException, NumberFormatException, IOException, ClassNotFoundException {
			
			//connection
			Connection c = ConnectionProvider.getConnection();
			
			
			//creating query
			String g = "update table1 set name=? , city=? where id=?";
					
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			System.out.println("Enter new name : ");
			String name = br.readLine();
			
			System.out.println("Enter new city name : ");
			String city = br.readLine();
			
			System.out.println("Enter the id : ");
			int id = Integer.parseInt(br.readLine());
			
			
			PreparedStatement pstmt = c.prepareStatement(g);
			
			pstmt.setString(1, name);
			pstmt.setString(2, city);
			pstmt.setInt(3, id);
			
			pstmt.executeUpdate();
			
			System.out.println("Done......................");
			
			
			c.close();	

	}

}
