package study.java.testFile;

import java.io.File;

public class InitFile {

	public static void fileCheck(boolean exist,File file,String string,int exit) {
		if(exist & file.exists()) {
			System.out.println("File " + string);
			System.exit(exit);
		}
	}
}
