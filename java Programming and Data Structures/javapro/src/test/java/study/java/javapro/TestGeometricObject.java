package study.java.javapro;

import study.java.abstractClass.GeometricObject;
import study.java.objectandclass.Circle;
import study.java.objectandclass.Rectangle;

public class TestGeometricObject {

	public static void main(String[] args) throws Exception {
		GeometricObject geometricObject1 = new Circle(9.0);
		GeometricObject geometricObject2 = new Rectangle(3,2);
		
		System.out.println("the two objects have the same area? " + equalArea(geometricObject1, geometricObject2));
		
		displayGeometricObject(geometricObject1);
		displayGeometricObject(geometricObject2);
		
	}
	
	public static boolean equalArea(GeometricObject object1,GeometricObject object2) {
		return object1.getArea() == object2.getArea();
	}
	
	public static void displayGeometricObject(GeometricObject object) {
		System.out.println();
		System.out.println(object.getClass() + " The area is " + object.getArea());
		System.out.println(object.getClass() + " The perimeter is " + object.getPerimeter());
	}
}
