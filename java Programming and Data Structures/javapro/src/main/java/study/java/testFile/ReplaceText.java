package study.java.testFile;

import java.io.File;
import java.io.PrintWriter;
import java.util.Scanner;

public class ReplaceText {

	public static void main(String[] args) throws Exception {
		if(args.length != 4) {
			System.out.println(
					"Usage: java ReplaceText sourceFile TargetFile oldStr newStr");
			System.exit(1);
			
		}
		
		//Check if source file exists
		File sourcefile = new File(args[0]);
		InitFile.fileCheck(false, sourcefile, args[0] + " does not exist", 2);
		
		
		//Check if target file exists
		File targetFile = new File(args[1]);
		InitFile.fileCheck(true, targetFile, args[1] + " already exist", 3);
		
		Scanner input = new Scanner(sourcefile);
		PrintWriter output = new PrintWriter(targetFile);
		while (input.hasNext()) {
			String s1 = input.nextLine();
			String s2 = s1.replaceAll(args[2], args[3]);
			output.println(s2 + "1");
		}
		input.close();
		output.close();
		
	}
}
