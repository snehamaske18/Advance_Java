package com.jspiders.multithreading.thread;

public class MyThread4 extends Thread {
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("hello from MyThread 4");
		}
	}

}
