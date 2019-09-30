package study.java.exception;

import java.util.Scanner;

public class QuotientWithException {
	
	public static int quotient(int number1, int number2) {
		if(number2 == 0) {
			throw new ArithmeticException("Divisor cannot be zero");
		}
		
		return number1 / number2;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two integers: ");
		int num1 = input.nextInt();
		int num2 = input.nextInt();
		
		
		try {
			int result = quotient(num1, num2);
			System.out.println(num1 + " / " + num2 + " = " + result);
		}
		catch(ArithmeticException ex) {
			System.out.println("Exection: an integer cannot be divided ty zero." );
		}
		System.out.println("Executuon continue ...");
	}

}
