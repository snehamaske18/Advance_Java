package com.jspiders.multithreading.thread;

public class MyThread2 implements Runnable {
@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println("hello from MyThread2");
			
		}
		
	} 

}

