package com.jspiders.multithreading.main;

import com.jspiders.multithreading.resource.MyResource;
import com.jspiders.multithreading.thread.MyThread5;
import com.jspiders.multithreading.thread.MyThread6;

public class ThreadMain4 {

	public static void main(String[] args) {
		MyResource myResource=new MyResource();
		MyThread5 myThread5=new MyThread5(myResource);
		MyThread6 myThread6=new MyThread6(myResource);
		myThread5.start();
		myThread6.start();
	}
	
	
}
