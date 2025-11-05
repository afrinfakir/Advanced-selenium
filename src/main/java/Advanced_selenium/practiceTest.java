package Advanced_selenium;

public class practiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//lti mindtree iq
		System.out.println(pallinDrome("M7#Ad0!a&35M1"));//pallinDrome("M7#Ad0!a&35M1");
	}
	
	public static boolean pallinDrome(String str){
		// Remove all non-alphabetic characters
	    String s1 = str.replaceAll("[^a-zA-Z]", "");
	    
	    // Reverse the string
	    String rev = "";
	    for (int i = s1.length() - 1; i >= 0; i--) {
	        rev = rev + s1.charAt(i);
	    }
	    
	    // Compare ignoring case
	    if (s1.equalsIgnoreCase(rev)) {
	        return true; // It is a palindrome
	    } else {
	        return false; // Not a palindrome
	    }
	}
}
