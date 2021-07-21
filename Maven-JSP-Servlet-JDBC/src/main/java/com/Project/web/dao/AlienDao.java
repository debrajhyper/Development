package com.Project.web.dao;

import java.sql.*;

import com.Project.web.model.Alien;

public class AlienDao {
	
	public Alien getAlien(int uid) throws ClassNotFoundException, SQLException {	
		Alien a = new Alien();
	
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("open...........");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc","root","root");
		System.out.println("=====jdbc=====");
		
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from table1 where id=" + uid );
		
		if(rs.next()) {
			a.setUid(rs.getInt("id"));
			a.setUname(rs.getString("name"));
			a.setCity(rs.getString("city"));
		}
		
		System.out.println("===========connected================");
		return a;
	}

}
