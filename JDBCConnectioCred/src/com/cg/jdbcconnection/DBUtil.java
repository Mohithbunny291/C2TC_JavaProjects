package com.cg.jdbcconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static Connection con;
	private static final String DB_DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
	private static final String DB_USERNAME = "root";
	private static final String DB_PASSWORD = "rootpassword";
	private static final String DB_URL = "jdbc:mysql://localhost:3306/employees_mod";
	
	public static Connection getCon() {
		try {
			Class.forName(DB_DRIVER_CLASS); //to load database driver
			//System.out.println("Driver loaded successfully....");
			
			//connect to database
			con = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
			//System.out.println("Connection established successfully");
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("Error..." + e.getMessage());
		}
		return con;
	}
}








