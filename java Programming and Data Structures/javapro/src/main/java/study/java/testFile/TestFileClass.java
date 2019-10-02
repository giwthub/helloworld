package study.java.testFile;

import java.io.File;
import java.util.Date;

public class TestFileClass {

	public static void main(String[] args) throws Exception {
		File file = new File("pom.xml");
		System.out.println("Does it exists? "+file.exists());
		System.out.println("The file has " + file.length() + " bytes.");
		System.out.println("Can it be read? " +file.canRead());
		System.out.println("Can it be written? " + file.canWrite());
		System.out.println("Is it a directory? " + file.isDirectory());
		System.out.println("Is it a file? " + file.isFile());
		System.out.println("Is it hidden? " + file.isHidden());
		System.out.println("Absolute path is " + file.getAbsolutePath());
		System.out.println("Lst modified on " + new Date(file.lastModified()));
	}
}
