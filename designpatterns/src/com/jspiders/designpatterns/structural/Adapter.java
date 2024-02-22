package com.jspiders.designpatterns.structural;

public class Adapter extends Employee implements Event {

	@Override
	public void womensDay() {
		System.out.println("Chef guest for womens day is"+getName());
	}

	@Override
	public void mensDay() {
		System.out.println("chef guest for mens day is"+getName());
		
	}

}
