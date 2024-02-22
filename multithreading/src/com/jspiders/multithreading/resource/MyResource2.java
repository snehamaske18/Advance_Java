package com.jspiders.multithreading.resource;

public class MyResource2 {

	public void resource() {
		System.out.println("this resource is accessed by "+Thread.currentThread().getName());
	}
}
