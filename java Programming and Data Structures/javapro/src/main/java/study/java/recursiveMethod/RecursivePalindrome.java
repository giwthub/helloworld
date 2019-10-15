package study.java.recursiveMethod;

public class RecursivePalindrome {

	public static boolean isPalindrome(String s) {
		return isPalindrome(s,0,s.length() - 1);
	}
	
	private static boolean isPalindrome(String s, int low,int high) {
		if(high <= low) {
			return true;
		}
		else if (s.charAt(low) != s.charAt(high)) {
			return false;
		}
		else {
			return isPalindrome(s,low + 1,high - 1);
		}
	}
	
	public static void main(String[] args) throws Exception {
		RecursivePalindromeUsingSubstring.main(args);
		
	}
}
