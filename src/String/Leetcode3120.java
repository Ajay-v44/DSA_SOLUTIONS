package String;

import java.util.HashSet;

public class Leetcode3120 {
    public int numberOfSpecialChars(String word) {
        int count = 0;
        HashSet<Character> chars = new HashSet<>();
        HashSet<Character> counted=new HashSet<>();
        for (int i = 0; i < word.length(); i++) {
            chars.add(word.charAt(i));
        }
        for (int i = 0; i < word.length(); i++) {
            char c=word.charAt(i);
            char upper=Character.toUpperCase(c);
            char lower=Character.toLowerCase(c);

            if(chars.contains(upper)&&chars.contains(lower)&&!counted.contains(lower)){
                count++;
                counted.add(lower);
            }
        }
        return count;
    }


    static void main() {

    }
}
