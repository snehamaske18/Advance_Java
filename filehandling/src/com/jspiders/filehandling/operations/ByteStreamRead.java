package com.jspiders.filehandling.operations;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteStreamRead {

	public static void main(String[] args) throws IOException {
		
		File file=new File("D:/File/demo.txt");
		if(file.exists()) {
			FileInputStream fileInputStream=new FileInputStream(file);
			System.out.println( fileInputStream.read());
		} else {
			System.out.println("File does not exists");
		}
	}
}
