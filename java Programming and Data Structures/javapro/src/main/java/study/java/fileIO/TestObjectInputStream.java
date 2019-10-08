package study.java.fileIO;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Date;

public class TestObjectInputStream {

	public static void main(String[] args) throws Exception {
		ObjectInputStream input = new ObjectInputStream(new BufferedInputStream(new FileInputStream("object.dat")));
		
		String hello = input.readUTF();
		int hh = input.readInt();
		Date date = (Date)(input.readObject());
		System.out.println(hello + " " + hh +" " + date);
		
		
		
		input.close();
	}
}
