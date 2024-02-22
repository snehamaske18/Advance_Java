package com.jspiders.jdbc.main;

import java.util.Scanner;

import com.jspiders.jdbc.operations.JDBCLoginSignup;

public class JDBCMain {

	public static void main(String[] args) {
		boolean flag=true;
		while(flag) {
			
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter 1 to signUp \nEnter 2 to log in\nEnter 3 to exit");
			int choice=scanner.nextInt();
			
			switch (choice) {
			case 1:
				  JDBCLoginSignup.signUp(scanner);
				break;
            case 2:
				JDBCLoginSignup.logIn(scanner);
				break;
             case 3:
            	 flag=false;
				System.out.println("Thank You");
				break;
			default:
                System.out.println("Invalid choice");
			}
		}
		
		
	}
}
