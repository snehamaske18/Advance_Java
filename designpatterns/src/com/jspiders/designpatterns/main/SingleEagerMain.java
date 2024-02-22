package com.jspiders.designpatterns.main;

import com.jspiders.designpatterns.creational.SingletonEager;

public class SingleEagerMain {
public static void main(String[] args) {
	SingletonEager singletonEager1= SingletonEager.getObject();
	SingletonEager singletonEager2= SingletonEager.getObject();
	System.out.println(singletonEager1);
	System.out.println(singletonEager2);
}
}
