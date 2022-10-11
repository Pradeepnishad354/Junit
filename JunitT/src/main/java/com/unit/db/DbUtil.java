package com.unit.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtil {
	
	private static Connection con;
	static {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
		}catch(ClassNotFoundException e) {
			
			e.printStackTrace();
			
		}try {
			
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/department","root","1234");
		}catch(SQLException e) {
			
			e.printStackTrace();
			
		}
		
		}
	public static Connection getCon() {
		
		return con;
	}

}
