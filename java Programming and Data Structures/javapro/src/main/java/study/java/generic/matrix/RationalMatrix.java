package study.java.generic.matrix;

import study.java.abstractClass.Rational;

public class RationalMatrix extends GenericMatrix<Rational>{

	@Override
	protected Rational add(Rational r1, Rational r2) {
		// TODO Auto-generated method stub
		return r1.add(r2);
	}

	@Override
	protected Rational multiply(Rational r1, Rational r2) {
		// TODO Auto-generated method stub
		return r1.multiply(r2);
	}

	@Override
	protected Rational zero() {
		// TODO Auto-generated method stub
		return new Rational(0,1);
	}

}
