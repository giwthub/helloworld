package study.java.fileIO;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.imageio.stream.FileImageOutputStream;

public class TestFileStream {

	public static void main(String[] args) throws Exception {
		FileOutputStream output = new FileOutputStream("temp.txt");
		
		for (int i = 0; i < 10; i++) {
			output.write(i);
		}
		
		output.close();
		
		FileInputStream input = new FileInputStream("temp.txt");
		int value;
		while ((value = input.read()) != -1) {

			System.out.print(value + " ");
		}
		
		input.close();
	}
}
