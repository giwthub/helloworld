package study.java.abstractClass;

public class Rational extends Number implements Comparable<Rational>{

	private long numrator = 0;
	private long denominator = 1;
	
	public Rational() {
		this(0,1);
	}
	
	public Rational(long numerator, long denominator) {

		long gcd = gcd(numerator, denominator);
		this.numrator = (denominator > 0 ? 1 : -1) * numerator /gcd;
		this.denominator = Math.abs(denominator) /gcd;
		
	}


	//find GCD of two numbers
	private static long gcd(long n, long d) {
		long n1 = Math.abs(n);
		long n2 = Math.abs(d);
		
		int gcd = 1;
		
		for (int i = 1; i <= n1 && i <= n2; i++) {
			if (n1 %i == 0 && n2 % i == 0) {
				gcd = i;
			}
		}
		
		
		return gcd;
		
	}

	public long getNumrator() {
		return numrator;
	}

	public long getDenominator() {
		return denominator;
	}

	public Rational add(Rational secondRational) {
		long n = numrator * secondRational.getDenominator() + denominator * secondRational.getNumrator();
		long d = denominator * secondRational.getDenominator();
		return new Rational(n, d);
	}
	
	public Rational subtract(Rational secondRational) {
		long n = numrator * secondRational.getDenominator() - denominator * secondRational.getNumrator();
		long d = denominator * secondRational.getDenominator();
		return new Rational(n, d);
	}
	
	public Rational multiply(Rational secondRational ) {
		long n = numrator * secondRational.getNumrator();
		long d = denominator  * secondRational.getDenominator();
		return new Rational(n, d);
	}
	
	public Rational divide(Rational secondRational) {
		long n = numrator * secondRational.getDenominator();
		long d = denominator * secondRational.getNumrator();
		return new Rational(n, d);
	}
	
	
	
	@Override
	public String toString() {
		
		if (denominator == 1) {
			return numrator + "";
		}
		
		return numrator + "/" + denominator ;
	}

	public int compareTo(Rational o) {

		if (this.subtract(o).getNumrator() > 0) {
			return 1;
		}else if (this.subtract(o).getNumrator() < 0) {
			return -1;
		}else {
			return 0;
		}
		
		
	}

	@Override
	public int intValue() {
		// TODO Auto-generated method stub
		return (int)doubleValue();
	}

	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return (long)doubleValue();
	}

	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return (float)doubleValue();
	}

	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return numrator * 1.0 / denominator;
	}

	public boolean equals(Object other) {
		if((this.subtract((Rational)(other))).getDenominator() == 0) {
			return true;
		}else {
			return false;
		}
	}
}
