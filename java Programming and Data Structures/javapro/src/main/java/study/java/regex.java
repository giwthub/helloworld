package study.java;


public class regex {

	
	public static void main(String[] args) throws Exception {
		String string = "j-a";
		System.out.println(string.matches("j\\p{P}a"));//true
		System.out.println(string.matches("j^\\p{P}a"));//false
		String s1 = "alksd8";
		System.out.println(s1.matches("[\\D]*[8]"));//true
		
		System.out.println("a".matches("a+b*"));//false
		System.out.println("abaaaaaaa".matches("a+b"));
	}
}
