package study.java.fileIO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class DetectEndOfFile {

	public static void main(String[] args) throws Exception {
		try {
			try {
				DataOutputStream output = new DataOutputStream(new FileOutputStream("test.txt"));
				output.writeDouble(52.1);
				output.writeDouble(523.1);
				output.writeDouble(523.1444);
				output.writeDouble(52323.1);
				output.writeDouble(523.321);
				
				DataInputStream input = new DataInputStream(new FileInputStream("test.txt"));
				while (true) {
					System.out.println(input.readDouble());
				}
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println("All data were read.");
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			
		}
	}
}
