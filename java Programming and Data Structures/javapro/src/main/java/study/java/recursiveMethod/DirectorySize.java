package study.java.recursiveMethod;

import java.io.File;
import java.util.Scanner;

/**
 * 显示目录或者文件的大小
 *
 */
public class DirectorySize {

	public static void main(String[] args) throws Exception {
		System.out.print("Enter a directory or a file:");
		Scanner input = new Scanner(System.in);
		String filePath = input.nextLine();
		System.out.println("size = " + getSize(new File(filePath)));
	}
	
	public static long getSize(File file) {
		long size = 0;
		
		if(file.isDirectory()) {
			File[] files = file.listFiles();
			for (int i = 0; files != null && i < files.length; i++) {
				size += getSize(files[i]);
			}
		}
		else
			size += file.length();
		return size;
		
	}
}
