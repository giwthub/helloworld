package study.java.testFile;

import java.io.File;
import java.io.PrintWriter;

public class WriterData {

	public static void main(String[] args) throws Exception {
		File file = new File("resources/test");
		if (file.exists()) {
			System.out.println("File already exists.");
			System.exit(1);
		}
		// Create a file
		PrintWriter outputPrintWriter = new PrintWriter(file);
		
		//Write formatted output to the file
		outputPrintWriter.print("John T Smith ");
		outputPrintWriter.println("88");
		outputPrintWriter.print("Eric K Jones ");
		outputPrintWriter.println("31");
		
		//Close the file
		outputPrintWriter.close();
		
	}
}
