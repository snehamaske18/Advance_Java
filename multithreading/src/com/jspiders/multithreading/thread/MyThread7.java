package com.jspiders.multithreading.thread;

import com.jspiders.multithreading.resource.MyResource1;

public class MyThread7 extends Thread{
MyResource1 myResource1;

public MyThread7(MyResource1 myResource1) {
	this.myResource1 = myResource1;
}

public void run() {
	
	myResource1.resource();
	
	
}
}
