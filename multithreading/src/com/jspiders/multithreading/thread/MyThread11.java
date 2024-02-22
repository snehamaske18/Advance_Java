package com.jspiders.multithreading.thread;

import com.jspiders.multithreading.resource.MyResource2;

public class MyThread11 extends Thread {

	private MyResource2 myResource2;

	public MyThread11(MyResource2 myResource2) {
		super();
		this.myResource2 = myResource2;
	}
	 @Override
	public void run() {
		// TODO Auto-generated method stub
		super.run();
		myResource2.resource();
	}
}
