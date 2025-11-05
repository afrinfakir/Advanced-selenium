package Advanced_selenium;

public class practiceT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// reverseWords("java selenium playwright");
		reverseEachWord("java selenium playwright");
		// reverse("java selenium playwright");
		reverseOneWord("java selenium playwright", "selenium");

	}

	public static void reverseWords(String str) {
		String[] words = str.split(" ");
		String rev = "";
		for (int i = words.length - 1; i >= 0; i--) {
			rev = rev + words[i] + " ";
		}
		System.out.println(rev);
	}

	public static void reverseEachWord(String str) {
		String[] words = str.split(" ");
		String rev = "";
		for (int i = 0; i < words.length; i++) {
			// for(int i= words.length-1;i>=0;i--) {
			String reversed = " ";
			for (int j = words[i].length() - 1; j >= 0; j--) {
				rev = rev + words[i].charAt(j);
			}
			rev = rev + reversed;
		}
		System.out.println(rev);
	}

	public static void reverse(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);
	}

	public static void reverseOneWord(String str, String revWord) {
		String[] words = str.split(" ");
		String result = "";
		for (int i = 0; i < words.length; i++) {
			String reversed = "";
			if (words[i].equals(revWord)) {
				for (int j = words[i].length() - 1; j >= 0; j--) {
					result = result + words[i].charAt(j);
				}
				result = result + reversed + " ";
			} else {
				result = result + words[i] + " ";
			}
		}
		System.out.println(result);
	}
}
