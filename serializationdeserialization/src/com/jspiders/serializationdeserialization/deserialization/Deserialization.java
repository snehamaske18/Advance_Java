package com.jspiders.serializationdeserialization.deserialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import com.jspiders.serializationdeserialization.object.User;

public class Deserialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File file=new File("D:/File/demo.txt");
		FileInputStream fileInputStream=new FileInputStream(file);
		ObjectInputStream objectInputStream=new ObjectInputStream(fileInputStream);
		User user=(User)objectInputStream.readObject();
		System.out.println(user);
		objectInputStream.close();
		fileInputStream.close();
		
	}

}
