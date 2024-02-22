package com.jspiders.filehandling.operations;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class CharStreamRead {

	public static void main(String[] args) throws IOException {
		
		File file=new File("D:/File/demo.txt");
		if(file.exists()) {
			FileReader fileReader=new FileReader(file);
			System.out.println(fileReader.read());
			
		}
		else {
			System.out.println("File does not exists");
		}
		
		if(file.exists()) {
			Scanner scanner=new Scanner(file);
			if(scanner.hasNextLine()) {
				System.out.println(scanner.nextLine());
			}
		}
	}
}
