package study.java.recursiveMethod;

public class RecursivePalindromeUsingSubstring {

	
	public static void main(String[] args) throws Exception {

		String[] strings = {
				"is","isn't", "wawawa","whwhwhwhw","moon","moom"
		};
		
		String is ;
				
		for (int i = 0; i < strings.length; i++) {
			if (Palindrome.isPalindrome(strings[i])) {
				is = strings[0];
			}else {
				is = strings[1];
			}
			
			System.out.println("\"" + strings[i] + "\" " + is + " a palindrome");
			
		}
		
		
		
	}
	
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
