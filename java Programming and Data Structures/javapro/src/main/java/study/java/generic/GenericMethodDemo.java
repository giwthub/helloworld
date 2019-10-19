package study.java.generic;

public class GenericMethodDemo {

	public static void main(String[] args) throws Exception {
		Integer[] innIntegers = {3,1,53,57,78,2};
		String[] strings = {"diannao","wanju","shuben"};
		
		GenericMethodDemo.print(innIntegers);
		GenericMethodDemo.print(strings);
		
		
	}
	
	public static <E> void print(E[] list) {
		
		int i = 0;
		for ( i = 0; i < list.length - 1; i++) {
			System.out.print(list[i] + ",");
			
		}
		
		System.out.println(list[i]);
	}
	
}
