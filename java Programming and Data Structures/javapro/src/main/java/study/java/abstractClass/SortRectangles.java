package study.java.abstractClass;

import java.util.Arrays;

public class SortRectangles {

	public static void main(String[] args) throws Exception {
		ComparableRectangle[] rectangle = {
				new ComparableRectangle(3, 2),
				new ComparableRectangle(99, 4),
				new ComparableRectangle(8, 4),
				new ComparableRectangle(8.8, 4.2),
		};
		
		Arrays.sort(rectangle);
		
		for (ComparableRectangle comparableRectangle : rectangle) {
			System.out.println(comparableRectangle + "");
		}
	}
}
