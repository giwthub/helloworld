package study.java.generic;

public class Max {

	public static void main(String[] args) throws Exception {
	
		System.out.println(max(42,9));
		System.out.println(max("cw","vjx"));
	}
	public static Comparable max(Comparable o1, Comparable o2) {
		//编译器不会检查o1，o2是否为同一类型
		/*
		 * Comparable is a raw type. References to generic type Comparable<T> should be parameterized
		 * 	可比较是一种原始类型。对泛型类型比较的引用应参数化
		 */
		if(o1.compareTo(o2) > 0)
			return o1;
		else
			return o2;
	}
	
}
