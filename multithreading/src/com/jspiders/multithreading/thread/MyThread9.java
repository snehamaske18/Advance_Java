package com.jspiders.multithreading.thread;

import java.util.Iterator;

public class MyThread9 extends Thread {

	@Override
	public void run() {
		String msg="Java IS A Programming Language";
		
		char arr[]= msg.toCharArray();
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
