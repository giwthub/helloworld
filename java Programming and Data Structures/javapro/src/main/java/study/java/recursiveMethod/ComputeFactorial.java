package study.java.recursiveMethod;

import java.util.Scanner;

public class ComputeFactorial {

	public static void main(String[] args) throws Exception {
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Input Integer: ");
		int n = input.nextInt();
		
		System.out.println("factorial(" + n + ")=" + factorial(n));
	}
	
	public static long factorial(int n) {
		if(n == 1)
			return 1;
		return n * factorial(n-1);
	}
}
