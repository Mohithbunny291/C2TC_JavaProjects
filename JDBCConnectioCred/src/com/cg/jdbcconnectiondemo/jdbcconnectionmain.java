package com.cg.jdbcconnectiondemo;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class jdbcconnectionmain {

	@SuppressWarnings("unused")
	public static void main(String[] args) throws SQLException {
		JdbcConnectionCred data = new JdbcConnectionCred();
		
		String query = "select name from clients where client_id = 2";
		//String query1 = "select * from clients";
//		String query2 = "INSERT INTO `clients` "
//				+ "VALUES (6,'Mohith','4242 Parking Street','garnian','GO','715-452-7345')";
//		
		ResultSet rs;
		Statement st = JdbcConnectionCred.con.createStatement();
		
		rs = st.executeQuery(query);
		//rs = st.executeQuery(query1);
		//int count = st.executeUpdate(query2);
		//System.out.println(count+"row/s affected");
		
		 // QueryOne 
		  rs.next(); 
		  String name = rs.getString("name");
		 
		
		//QueryThree
		
		
		
//		while (rs.next()) {
//			String Userdata = rs.getInt(1)+":"+rs.getString("name")+
//					":"+rs.getString("address")+":"+rs.getString("city")+
//					":"+rs.getString("state")+":"+rs.getString(6);
//			System.out.println(Userdata);
//		}
		
		System.out.println(name);
		
		
		st.close();
		rs.close();
		
		
		/*
		 * if (data != null) { System.out.println("Connection established"); }else {
		 * System.out.println("Failed"); }
		 */

	}

}
