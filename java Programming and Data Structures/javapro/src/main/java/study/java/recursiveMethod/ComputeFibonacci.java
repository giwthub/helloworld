package study.java.recursiveMethod;

import java.util.Scanner;

public class ComputeFibonacci {

	public static void main(String[] args) throws Exception {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a Integer :");
		
		int n = input.nextInt();
		
		System.out.println("Fibonacci(" + n + ") = " + fibonacci(n) );
	}
	
	public static long fibonacci(int n) {
		if (n == 0) {
			return 0;
		}else if (n == 1) {
			return 1;
		}
		return fibonacci(n-1) + fibonacci(n-2);
	}
}
