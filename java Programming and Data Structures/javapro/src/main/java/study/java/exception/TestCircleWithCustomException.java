package exception;



public class TestCircleWithCustomException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			new CircleWithCustomException(8);
			new CircleWithCustomException(-9);
			new CircleWithCustomException(0);
		}
		catch(InvalidRadiusException ex)
		{
			System.out.println(ex);
		}
	}
	
	
	
	

}

class CircleWithCustomException{
	
	public CircleWithCustomException() throws InvalidRadiusException {
		this(1.0);
	}
	
	
	
	
	
	
	public CircleWithCustomException(double newRadius) throws InvalidRadiusException {
		// TODO Auto-generated constructor stub
		setRadius(newRadius);
		numberOfObjects++;
		
	}

	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) throws InvalidRadiusException {
		if(radius >=0)
			this.radius = radius;
		else
			throw new InvalidRadiusException(radius);
	}
	
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	public double findarea() {
		return radius * radius *Math.PI;
	}

	




	private double radius;
	
	private static int numberOfObjects = 0;
}