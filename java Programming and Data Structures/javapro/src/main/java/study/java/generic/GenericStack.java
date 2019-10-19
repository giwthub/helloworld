package study.java.generic;

import java.util.ArrayList;

public class GenericStack<E> {

	private ArrayList<E> list = new ArrayList<E>();
	
	public int getSize() {
		return list.size();
	}
	
	public E peek() {
		return list.get(getSize() - 1); 
	}
	
	public void push(E o) {
		list.add(o);
	}
	
	public E pop() {
		
		E o = list.get(getSize() - 1);
		list.remove(getSize() - 1);
		
		return  o;
	}
	
	public boolean isEmpty() {
		return list.isEmpty();
	}
	
	public String toString() {
		return "Stack: " + list.toString();
	}
	
	public static void main(String[] args) throws Exception {
		GenericStack<Integer> stack1 = new GenericStack<Integer>();
		stack1.push(43);
		stack1.push(90);
		System.out.println(stack1.toString());
	}
	
}
