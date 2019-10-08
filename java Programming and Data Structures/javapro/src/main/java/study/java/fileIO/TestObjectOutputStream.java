package study.java.fileIO;

import java.io.FileOutputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.util.Date;

public class TestObjectOutputStream {

	public static void main(String[] args) throws Exception {
		ObjectOutput output = new ObjectOutputStream(new FileOutputStream("Object.dat"));
		
		output.writeUTF("hello");
		output.writeInt(8848);
		output.writeObject(new Date());
		output.close();
	}
}
