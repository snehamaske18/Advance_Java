package com.jspiders.multithreading.resource;

public class Account {
	
	private double accountBalance;
	
	public synchronized void deposit(double amount) {
		System.out.println("Amount of "+amount+" has been deposited in your account!!1");
		accountBalance+=amount;
		System.out.println("Your current balance is "+accountBalance);
	}
	
	public synchronized void withDraw(double amount) {
		System.out.println("Amount of "+amount+" has been debited from your account");
		accountBalance-=amount;
		System.out.println("Your current balance is "+accountBalance);
	}

}
