/** Checks if a given string is a palindrome. */
public class Palindrome {

	public static void main(String[]args) {
    	System.out.println(isPalindrome(args[0]));
    }
	
	/** Checks if the given string is a palindrome. */
	public static boolean isPalindrome(String s) {
		if (s.length() < 2) {
			return true;
		}
		else {
			while (s.length() > 1) {
				if (s.charAt(0) == s.charAt(s.length() - 1)) {
					s = s.substring(1, s.length() - 1);
					isPalindrome(s);
					return true;
				}
				else {
					return false;
				}
			}
		}
		return true; 
    }
}