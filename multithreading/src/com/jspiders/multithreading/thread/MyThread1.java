package com.jspiders.multithreading.thread;

import java.util.Iterator;

public class MyThread1 extends Thread {
   @Override
public void run() {
	for(int i=0;i<5;i++) {
		System.out.println("hello from MyThread1");
	}
}
}
