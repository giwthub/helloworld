package study.java.generic;

/**
 * 提供一个泛型方法，对一个Comparable对象数组进行排序。
 * 这些对象是Comparable接口的实例，它们使用compareTo方法进行比较。
 * 为了测试该方法，
 * 程序对一个整数数组、
 * 一个双精度数字数组、
 * 一个字符数组
 * 以及一个字符串数组分别进行了排序。
 *
 */

public class GenricSort {
	
	public static void main(String[] args) throws Exception {
		Integer[] intArray = {
				new Integer(8),
				new Integer(2),
				new Integer(87),
		};
		Double[] doubleArray = {
				new Double(4.2),
				new Double(2.9),
				new Double(8.4),
				new Double(9.4)
		};
		Character[] charArray = {
				new Character('o'),
				new Character('u'),
				new Character((char)98),
		};
		String[] stringArray = {
				new String("hello"),
				"world",
				"java"
		};
		
		sort(intArray);
		sort(doubleArray);
		sort(stringArray);
		
		printList(intArray);
		printList(stringArray);
		printList(charArray);
		printList(doubleArray);
	}

	public static <E extends Comparable<E>> void sort(E[] list) {
		E currentMin;
		int currentMinIndex;
		for (int i = 0; i < list.length; i++) {
			currentMin = list[i];
			currentMinIndex = i;
			for (int j = 0; j < list.length; j++) {
				if (currentMin.compareTo(list[j]) > 0) {
					currentMin = list[j];
					currentMinIndex = j;
				}
			}
			
			if (currentMinIndex != i) {
				list[currentMinIndex] = list[i];
				list[i] = currentMin;
			}
		}
		
	}
	public static void printList(Object[] list) {
		for (int i = 0; i < list.length; i++) {
			System.out.print(list[i] + " ");
		}
		System.out.println();
	}
}

