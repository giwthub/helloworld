package study.java.generic;

public class AnyWildCardDemo {

	public static void main(String[] args) throws Exception {
		GenericStack<Integer> intsStack = new GenericStack<Integer>();
		intsStack.push(9);
		intsStack.push(4);
		intsStack.push(-8);
		print(intsStack);
	}
	
	
	public static void print(GenericStack<?> stack) {
		while(!stack.isEmpty())
			System.out.println(stack.pop() + " ");
	}
}
