package study.java.fileIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.imageio.stream.FileImageInputStream;

public class Copy {
	public static void main(String[] args) throws Exception {
		if (args.length != 2) {
			System.out.println("Usage: java Copy sourceFile targetfile");
			System.exit(1);
		}
	
		File sourceFile = new File(args[0]);
		
		if (!sourceFile.exists()) {
			System.out.println("Source file " + args[0] + " doesn't exists.");
			System.exit(2);
		}
		
		File targerFile = new File(args[1]);
		if (!targerFile.exists()) {
			System.out.println("Target file " + args[1] + " doesn't exists.");
			System.err.println(3);
		}
		
		BufferedInputStream input = new BufferedInputStream(new FileInputStream(sourceFile));
		
		BufferedOutputStream output = new BufferedOutputStream(new FileOutputStream(targerFile));
		
		int r, numberOfBytesCopied = 0;
		while ((r = input.read()) !=  -1) {

			output.write((byte)r);
			numberOfBytesCopied ++;
		}
		
		System.out.println(numberOfBytesCopied + " bytes copied.");
		
		input.close();
		output.close();
	}
	
	
}
