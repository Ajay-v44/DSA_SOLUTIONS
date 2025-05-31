package String;

import java.util.Arrays;
import java.util.Scanner;

public class NonRepeatingCharacter {
    static final int MAX_CHAR = 26;

    //Leet Code 387. First Unique Character in a String
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String");
        System.out.println(findNonRepeatedCharacterOptimized(sc.next()));
    }

    static char findNonRepeatedCharacterNA(String s) {
//        Native Or Bruteforce Approach
//        O(n) Time Complexity
//        O(n) Space Complexity
        char[] tempArray = s.toCharArray();
        Arrays.sort(tempArray);
        if (tempArray.length == 1) {
            return tempArray[0];
        }
        for (int i = 0; i < tempArray.length - 1; i++) {
            if (i == 0) {
                if (tempArray[i] != tempArray[i + 1]) {
                    return tempArray[i];
                }
            } else {
                if (tempArray[i] != tempArray[i + 1] && tempArray[i] != tempArray[i - 1]) {
                    return tempArray[i];
                }
            }
        }
        return '$';
    }

    static char findNonRepeatedCharacterOptimized(String s) {
    /*
    using frequency array
           O(2*n) TC
           O(MAX_CHAR) SC
            */
        int[] freq = new int[MAX_CHAR];
        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
        }
        for (char ch : s.toCharArray()) {
            if (freq[ch - 'a'] == 1) {
                return ch;
            }
        }
        return '$';
    }
}
