package debraj;

import java.sql.*;

public class select_jdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection c = ConnectionProvider.getConnection();
		
		String q = "select * from table1";
		
		Statement stmt = c.createStatement();
		ResultSet set = stmt.executeQuery(q);
		
		while(set.next()) {
			int id = set.getInt(1);
			String name = set.getString(2);
			String city = set.getString(3);
			
			System.out.printf("%2d : %8s : %2s \n",id,name,city);
		}

	} 

}
