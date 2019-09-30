package thinkofoop;

import java.util.Arrays;

public class StackOfIntegers {

	public StackOfIntegers() {

		this(16);
	}
	
	

	public StackOfIntegers(int capacity) {
		elements = new int[capacity];
		size = 0;
	}
	
	public boolean isEmpty() {
		return size== 0 ? false :true;
	}
	
	public int peek() {
		return elements[size -1];
	}
	
	public void push(int value) {
		
		if(size > elements.length) {
			int[] temp = new int[elements.length * 2];
			System.arraycopy(elements, 0, temp, 0, elements.length);
			elements = temp;
		}
		
		
		
		elements[size] = value;
		size++;
		System.out.println("push: " + value);
	}
	
	public int pop() {
		
		return elements[--size];
	}
	
	public int getSize() {
		return size;
	}
	
	

	
	@Override
	public String toString() {
		System.out.println("StackOfIntegers [elements=" + Arrays.toString(elements) + ", size=" + size + "]");
		return "StackOfIntegers [elements=" + Arrays.toString(elements) + ", size=" + size + "]";
	}




	private int[] elements;
	private int size;
}
