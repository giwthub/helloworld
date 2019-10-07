package study.java.fileIO;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import sun.security.action.PutAllAction;


public class TestDataStream {

	public static void main(String[] args) throws Exception {
		DataOutputStream output = new DataOutputStream(new FileOutputStream("temp.txt"));
		
		//向temp.txt写入数据
		output.writeUTF("John");
		output.writeDouble(99.2);
		output.writeUTF("Jim");
		output.writeDouble(333.2);
		output.writeUTF("George");
		output.writeDouble(78.32);
				
		output.close();
		
		DataInputStream input = new DataInputStream(new FileInputStream("temp.txt"));
		
		//从temp.txt读取数据
		System.out.println(input.readUTF() + "-" + input.readDouble());
		System.out.println(input.readUTF() + "-" + input.readDouble());
		System.out.println(input.readUTF() + "-" + input.readDouble());
		input.close();
	}
}
