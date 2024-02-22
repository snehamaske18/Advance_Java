package com.jspiders.multithreading.main;

import com.jspiders.multithreading.resource.MyResource1;
import com.jspiders.multithreading.thread.MyThread7;
import com.jspiders.multithreading.thread.MyThread8;

public class ThreadMain5 {

	public static void main(String[] args) {
		MyResource1 myResource1= new MyResource1();
		MyThread7 myThread7=new MyThread7(myResource1);
		MyThread8 myThread8=new MyThread8(myResource1);
		myThread7.setName(" Thread 7");
		myThread8.setName(" Thread 8");
		myThread7.start();
		myThread8.start();
	}
}
