package study.java.fileIO;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.function.ObjDoubleConsumer;

public class TestObjectStreamForArray {

	public static void main(String[] args) throws Exception {
		int[] numbers = {2,31,5,3,6,7};
		
		String[] strings = {"BeiJing",
				"Shanghai",
				"Guangzhou",
				"xian"
		};
		ObjectOutputStream output = new ObjectOutputStream(
				new BufferedOutputStream(
						new FileOutputStream("array.dat",false)));
		output.writeObject(numbers);
		output.writeObject(strings);
		output.close();
		
		
		ObjectInputStream input = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream("array.dat")));
		
		int[] num = (int[])(input.readObject());
		String[] str = (String[])(input.readObject());
		
		
		
		input.close();
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
			
		}
		System.out.println();
		for (int i = 0; i < str.length; i++) {
			System.out.print(str[i] + " ");
		}
		System.out.println();
	}
}
