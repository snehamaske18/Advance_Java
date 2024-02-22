package com.jspiders.designpatterns.main;

import java.util.Scanner;

import com.jspiders.designpatterns.creational.Beverage;
import com.jspiders.designpatterns.creational.GreenTea;
import com.jspiders.designpatterns.creational.MasalaTea;

public class FactoryMain {

	public static void main(String[] args) {
		
		try {
			 factory().order();
		} catch (NullPointerException e) {
			System.out.println("no tea is ordered");
			e.printStackTrace();
		}
	}

	private static Beverage factory() {
		Beverage beverage= null;
		
		System.out.println("enter 1 to order Masala Tea\nEnter 2 to order Green Tea\nEnter 3 to order Ginger Tea\nEnter 4 to order Lemon Tea");
		System.out.println("enter your choice");
		Scanner scanner=new Scanner(System.in);
		int choice=scanner.nextInt();
		scanner.close();
		switch (choice) {
		case 1:
			beverage=new MasalaTea();
			break;
		case 2:
			beverage=new GreenTea();
			break;
		case 3:
			beverage=new GreenTea();		
			break;
		case 4:
			beverage=new GreenTea();
			break;

		default:
			System.out.println("Enter valid choice");
			break;
		}
		return beverage;
		
	}
}
