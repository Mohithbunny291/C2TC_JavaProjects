package com.cg.jdbcconnectiondemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class JdbcConnectionCred {

		private static final String url = "jdbc:mysql://localhost:3306/sql_invoicing";
		private static final String uname = "root";
		private static final String pass = "rootpassword";
		public static Connection con = null;
		
		
		
		static {
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				con = DriverManager.getConnection(url, uname, pass);
			} catch (ClassNotFoundException | SQLException e) {
				e.printStackTrace();
			}
		}
		/*
		 * public static Connection getConnection() { return con; }
		 */
}