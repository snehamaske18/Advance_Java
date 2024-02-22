package com.jspiders.multithreading.thread;

import com.jspiders.multithreading.resource.MyResource;

public class MyThread5 extends Thread {

	private MyResource myResource;

	public MyThread5(MyResource myResource) {
		
		this.myResource = myResource;
	}
	@Override
	public void run() {
	
		synchronized (myResource.resource1) {
			System.out.println("Lock is applied on resource 1");
			
			synchronized (myResource.resource2) {
				System.out.println("Lock is applied on resource 2");
			}
		}
	}
	
}
