package study.java.fileIO;

import java.io.RandomAccessFile;

public class TestRandomAccessFile  {

	public static void main(String[] args) throws Exception {
		try {
			RandomAccessFile inout = new RandomAccessFile("input.dat", "rw");
			
			inout.setLength(0);
			for (int i = 0; i < 200; i++) {
				inout.writeInt(i);
			}
			
			System.out.println("Current file length is " + inout.length());
			
			inout.seek(0);
			System.out.println("The first number is " + inout.readInt());
			System.out.println("The first number is " + inout.read());
			
			inout.seek(1 * 4);
			System.out.println("The second number is " + inout.readInt());
			
			inout.seek(9*4);
			System.out.println("The tenth numbet is " + inout.readInt());
			
			inout.writeInt(999);
			
			inout.seek(inout.length());
			

			inout.writeInt(888);
			System.out.println("The new length is " + inout.length());
			
			inout.seek(10 * 4);
			System.out.println("The eleventh numbet is " + inout.readInt());
			
			
			inout.close();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
