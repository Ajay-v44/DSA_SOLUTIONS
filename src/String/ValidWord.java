package String;

public class ValidWord {
    public static void main(String[] args) {
        System.out.println(isValid("2"));
    }

    static boolean isValid(String word) {
        if (word.length() < 3) return false;

        boolean hasVowel = false;
        boolean hasConsonant = false;

        String vowels = "aeiouAEIOU";

        for (char c : word.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) return false;

            if (Character.isLetter(c)) {
                if (vowels.indexOf(c) != -1) {
                    hasVowel = true;
                } else {
                    hasConsonant = true;
                }
            }
        }

        return hasVowel && hasConsonant;
    }
}
