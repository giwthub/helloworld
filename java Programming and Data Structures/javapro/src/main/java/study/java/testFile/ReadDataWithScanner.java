package study.java.testFile;

import java.io.File;
import java.text.FieldPosition;
import java.util.Scanner;

public class ReadDataWithScanner {

	public static void main(String[] args) throws Exception {
	
		//Create a File instance
		File file = new File("resources/test");
		
		//Create a Scanner for the file
		Scanner inputScanner = new Scanner(file);
		
		//Read data from a file
		while (inputScanner.hasNext()) {

			String firstNameString = inputScanner.next();
			String miString = inputScanner.next();
			String lastNameString = inputScanner.next();
			int score = inputScanner.nextInt();
			System.out.println(firstNameString + " " + miString + " " + lastNameString + " " + score);
		}
		//Close the file
		inputScanner.close();
		
	}
	
}
