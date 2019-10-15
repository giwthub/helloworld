package study.java.recursiveMethod;

public class Palindrome {

	public static void main(String[] args) throws Exception {
		RecursivePalindromeUsingSubstring.main(args);
		
	}
	
	public static boolean isPalindrome(String s) {
		for (int i = 0; i < s.length()/2; i++) {
			while (s.charAt(i) != s.charAt(s.length() -1 - i) ) {

				return false;
				
			}
		}
		return true;
	}
}
