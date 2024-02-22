package com.jspiders.filehandling.operations;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamWrite {

	public static void main(String[] args) throws IOException {
		
		File file=new File("D:/File/demo.txt");
		
		if(file.exists()) {
			FileOutputStream fileOutputStream=new FileOutputStream(file);
			fileOutputStream.write(1234);
			System.out.println("Data is written successfully");
		} else {
			boolean status= file.createNewFile();
			if(status) {
				System.out.println("File is created");
				FileOutputStream fileOutputStream=new FileOutputStream(file);
				fileOutputStream.write(1234);
				System.out.println("Data is written successfully");
			} else {
				System.out.println("File is not created");
			}
		}
	}
}
