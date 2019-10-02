package study.java.testFile;

import java.net.URL;
import java.util.Scanner;

public class ReadFileFromURL {

	public static void main(String[] args) throws Exception {
		System.out.println("Enter a URL: ");
		String uRLString = new Scanner(System.in).next();
		URL url = new URL(uRLString);
		int count = 0;
		Scanner input = new Scanner(url.openStream());
		while (input.hasNext()) {

			String line = input.nextLine();
			count += line.length();
			System.out.println(count +" " + line.length());
		}
		System.out.println("The file size is " + count + " chararcters.");
	}
}
