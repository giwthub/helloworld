package study.java.recursiveMethod;

public class RecursivePalindromeUsingSubstring {

	
	
	public static boolean isPalindrome(String s) {

		if (s.length()<= 1) {
			return true;
		}else if (s.charAt(0) != s.charAt(s.length() - 1)) {
			return false;
		}
		else {
			return isPalindrome(s.substring(1,s.length() - 1));

		}
	}
}
