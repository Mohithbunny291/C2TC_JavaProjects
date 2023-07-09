package com.cg.jdbcconnection;

import java.util.Scanner;

public class MainExecution {

	private static Scanner scan = new Scanner(System.in);
	//static StatementInterface SF;
	
	public static void main(String[] args) throws Exception{
		
		//StatementInterface.showDeps();
		int choice;
		
		// int choice = Integer.parseInt(scan.nextLine());
		do {		
			
			choice =  displayMenu(scan);
			
			switch (choice) {
			
				case 1:
					System.out.println("Choice 1 Selected: \nShowing Tables in Database");
					StatementInterface.showTables();
					break;
			
				case 2:
					System.out.println("Choice 2 Selected: \nShowing Department Details");
					StatementInterface.showDeps();
					break;
				
				case 3:
					System.out.println("Choice 3 Selected: "
							+ "\n Enter the values of Dept.no and Dept.name");
					StatementInterface.insertRecord();
					break;
					
				case 4:
					System.out.println("Choice 4 Selected: \n Showing Employee ID -> Department they belongs");
					StatementInterface.empIdToDepName();
					break;
					
				case 5:
					System.out.println("Choice 4 Selected: \n Showing Employee ID -> Department they belongs");
					StatementInterface.empIdToDepNameOFManagers();
					break;
					
				case 6:
					System.out.println("Thank you..... Quitting the querys process now.");
					break;
				
				default:
					break;
			}
		}while(choice != 6);		
	}
	
	public static int displayMenu(Scanner scan) {
		System.out.println("Enter Choice");
		System.out.println("1. To Show Tables in the Database");
		System.out.println("2. Show Department Details");
		System.out.println("3. Insert Department Details");
		System.out.println("4. Show Employee ID and which Department they belong and Dates");
		System.out.println("5. Show Employee ID and which Department of Managers they belong and Dates");
		System.out.println("6. Quit");
		
		return scan.nextInt();
	}

}
