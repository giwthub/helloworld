package objectandclass;

public class Circle {
	private double radius = 1.0;
	
	private static int numberOfObjects = 0;
	
	public Circle() {
		numberOfObjects++;
	}
	
	public Circle(double Radius) {
		this.radius = radius;
		numberOfObjects++;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = (radius >= 0) ? radius : 0;
	}
	
	public int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	public double getArea() {
		return radius * radius * Math.PI;
	}
	
	

}
