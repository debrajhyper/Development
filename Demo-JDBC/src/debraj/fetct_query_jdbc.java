package debraj;

import java.sql.*;

public class fetct_query_jdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Connection c = ConnectionProvider.getConnection();
		
		String q = "select name,city from table1 where id=2";
		
		Statement stem = c.createStatement();
		ResultSet set = stem.executeQuery(q);
		
		while(set.next()) {
			String name = set.getString("name");
			String city = set.getString("city");
			
			System.out.printf("%7s : %7s",name,city);
		}
		
		c.close();

	}

}
