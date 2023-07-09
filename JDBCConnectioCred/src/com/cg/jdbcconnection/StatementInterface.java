package com.cg.jdbcconnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StatementInterface{
	static Connection con;
	static Statement st;
	private static Scanner scan = new Scanner(System.in);
	
	static {
		con = DBUtil.getCon();
		
		try {
			st = con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static void showTables() throws SQLException {
		String query = "Show tables";
		ResultSet rs = st.executeQuery(query);
		System.out.println("--Tables_in_employees_mod--");
		if(rs != null) {
			while(rs.next()) {
				System.out.println(rs.getString("Tables_in_employees_mod"));
			}
		}else {
			System.out.println("No Tables found");
			rs.close();
			st.close();
		}
	}
	
	
	public static void showDeps() {
		String query = "SELECT * FROM t_departments order by dept_no";
		try {
			ResultSet rs = st.executeQuery(query);
			
			if(rs != null) {
				while(rs.next()) {
					System.out.println(rs.getString("dept_no")+"\t"+rs.getString("dept_name"));
				}
			}else {
				System.out.println("No record found");
				//rs.close();
				st.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void insertRecord() throws Exception{
		
		String query = "insert into t_departments(dept_no, dept_name) values (?,?)";
		PreparedStatement ps = con.prepareStatement(query);
		
		//String dep_no = scan.nextLine();
		//String dep_name = scan.nextLine();
		
		ps.setString(1, scan.nextLine());
		ps.setString(2, scan.nextLine());
		
		int rows = ps.executeUpdate();
		
		if (rows > 0) {
			System.out.println("Record insertion successful");
		}	
		ps.close();
		st.close();
		
	}
	
	public static void empIdToDepName() {
		String query = "Select * from t_dept_emp";
		try {
			ResultSet rs = st.executeQuery(query);
			
			if(rs != null) {
				while(rs.next()) {
					System.out.println(rs.getString("emp_no")+"\t"+rs.getString("dept_no")
										+"\t"+rs.getString("from_date")+"\t"+rs.getString("to_date"));
				}
			}else {
				System.out.println("No record found");
				//rs.close();
				st.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void empIdToDepNameOFManagers() {
		String query = "Select * from t_dept_manager";
		try {
			ResultSet rs = st.executeQuery(query);
			
			if(rs != null) {
				while(rs.next()) {
					System.out.println(rs.getString("emp_no")+"\t"+rs.getString("dept_no")
										+"\t"+rs.getString("from_date")+"\t"+rs.getString("to_date"));
				}
			}else {
				System.out.println("No record found");
				//rs.close();
				st.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}