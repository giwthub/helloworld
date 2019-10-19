package study.java.generic;

public class WildCardNeedDemo {
	
	public static void main(String[] args) throws Exception {
		GenericStack<Number> stringStack = new GenericStack<Number>();
		stringStack.push(5);
		stringStack.push(5.3);
		
		System.out.println("" + max(stringStack));
	}

	public static double max(GenericStack<Number> stack) {
		
		double max = stack.pop().doubleValue();
		
		while(!stack.isEmpty()) {
			double value = stack.pop().doubleValue();
			if(value > max)
				max = value;
		}
		
		
		return max;
		
	}
}
