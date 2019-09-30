package study.java.exception;

public class InvalidRadiusException extends Exception {

	public InvalidRadiusException(double radius) {
		super("Invalid radius" + radius);
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	
	private double radius;

}
