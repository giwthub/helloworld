package study.java.abstractClass;

import java.util.Date;

public abstract class GeometricObject {

	private String color = "write";
	private boolean filled;
	private Date dateCreated;
	
	protected GeometricObject() {
		dateCreated = new Date();
	}
	
	protected GeometricObject(String color, boolean filled) {
		this();
		this.color = color;
		this.filled = filled;
		
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
	
		return "created on " + dateCreated + "\tcolor:" + color + " and filled: " + filled;
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
	
}
