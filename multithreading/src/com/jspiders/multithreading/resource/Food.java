package com.jspiders.multithreading.resource;

public class Food {
	private boolean available=true;
	
	public synchronized void order() {
		System.out.println("Order is received!!!");
		if(available) {
			System.out.println("food is ready!!!");
			System.out.println("Food is delivered!!!");
		}
			
			else {
				System.out.println("Food is not ready");
				System.out.println("plz wait!!!");
				try {
					wait();
				} catch (InterruptedException e) {
			
					e.printStackTrace();
				}
				System.out.println("Food is delivered!!!");
			}
		}
	public synchronized void prepare() {
		System.out.println("food is preparing");
		System.out.println("Food is ready");
		available=true;
		notify();
	}
	
	}

