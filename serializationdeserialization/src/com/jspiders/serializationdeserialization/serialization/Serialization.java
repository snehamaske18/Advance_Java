package com.jspiders.serializationdeserialization.serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import com.jspiders.serializationdeserialization.object.User;

public class Serialization {
public static void main(String[] args) throws IOException {
	File file=new File("D:/File/demo.txt");
	FileOutputStream fileOutputStream=new FileOutputStream(file);
	ObjectOutputStream objectOutputStream=new ObjectOutputStream(fileOutputStream);
	objectOutputStream.writeObject(new User(1,"ram",9623943864l,"ram@123"));
	System.out.println("object has been initialized");
	objectOutputStream.close();
	fileOutputStream.close();	
}
}
