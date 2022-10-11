package com.unit.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DbConnection {
	
	
	public Connection getCon() {
		
		Connection con=null;
		try {
			
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/department","root","1234");
		
		}catch(Exception e) {
			e.printStackTrace();
			
			
		}
		return con;
	}

}
