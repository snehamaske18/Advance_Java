package com.jspiders.multithreading.thread;

import com.jspiders.multithreading.resource.MyResource2;

public class MyThread10 extends Thread{

	private MyResource2 myResource2;
	public MyThread10(MyResource2 myResource2) {
		
		this.myResource2 = myResource2;
	}
	@Override
	public void run() {
		myResource2.resource();
		
	}
}
