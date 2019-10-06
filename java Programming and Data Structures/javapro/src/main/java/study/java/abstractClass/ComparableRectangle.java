package study.java.abstractClass;

import study.java.objectandclass.Rectangle;

public class ComparableRectangle
	extends Rectangle implements Comparable<ComparableRectangle>{

	public int compareTo(ComparableRectangle o) {

		if (getArea() > o.getArea()) {
			return 1;
		}else if (getArea() < o.getArea()) {
			return -1;
		}
		else 
			return 0;
	}

	public ComparableRectangle(double width,double height) {
		super(width,height);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " Area: " + getArea();
	}
	
}
