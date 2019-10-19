package study.java.generic;

import study.java.abstractClass.GeometricObject;
import study.java.objectandclass.Circle;
import study.java.objectandclass.Rectangle;

public class BoundedTypeDemo {

	public static void main(String[] args) throws Exception {
		System.out.println(equalArea(new Rectangle(3,1), new Circle(8)));
	}
	
	public static <E extends GeometricObject> 
	boolean equalArea(E object1, E object2) {
		
		return object1.getArea() == object2.getArea();
		
	}
	
}
