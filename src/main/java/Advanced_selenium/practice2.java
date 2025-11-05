package Advanced_selenium;

public class practice2 {

		public static String removeVowels(String input) {
        return input.replaceAll("(?i)[aeiou]", "");
    }

    public static void main(String[] args) {
        String input = "REMOVE VOWELS FROM string";
        String output = removeVowels(input);
        System.out.println(output);
    }

}
