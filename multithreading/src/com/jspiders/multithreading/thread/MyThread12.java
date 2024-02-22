package com.jspiders.multithreading.thread;

public class MyThread12 extends Thread {

	@Override
	public void run() {
		for (int i=0;i<5;i++) {
			System.out.println(i);
			if(i==3) {
				stop();
			}
		}
	}
	
}
