package study.java.generic;


public class MaxUsingGenericType {

	
	public static <E extends Comparable<E>> E max(E o1, E o2) {
		if(o1.compareTo(o2) > 0)
			return o1;
		else return o2;
	}
	public static void main(String[] args) throws Exception {
		System.out.println(MaxUsingGenericType.max(3,2) + "\n" + 
		MaxUsingGenericType.max("42", "31") + "\n" + 
		MaxUsingGenericType.max('a', 'b'));
		
		
	}
}
