package study.java.abstractClass;

public class TestRationalClass {

	public static void main(String[] args) throws Exception {
		Rational r1 = new Rational(9,2);
		Rational r2 = new Rational(93,3);
		
		System.out.println(r1 +" + " + r2 + " = " + r1.add(r2));
		System.out.println(r1 +" - " + r2 + " = " + r1.subtract(r2));
		System.out.println(r1 +" * " + r2 + " = " + r1.multiply(r2));
		System.out.println(r1 +" / " + r2 + " = " + r1.divide(r2));
		System.out.println(r1);
		System.out.println(r2);
	}
}
