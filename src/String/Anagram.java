package String;

import java.util.HashMap;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Two Strings :\t");
        String s1 = sc.next();
        String s2 = sc.next();

        if (checkAnagramOptimized(s1, s2))
            System.out.println("Strings Are Anagram");
        else
            System.out.println("Strings are not Anagram");
    }

    static boolean checkAnagramBF(String s1, String s2) {
//if both strings are not of same length then it won't be anagram
        if (s1.length() != s2.length()) {
            return false;
        }
//        BruteForce Or Native Approach
//        Time Complexity - O(n^2)
//        Space Complexity - O(1)
        boolean isAnagram = true;
        HashMap<Integer, Character> isVisited = new HashMap<>();

        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            int flag = 0;
            for (int j = 0; j < s2.length(); j++) {
                if (ch == s2.charAt(j)) {
                    if (isVisited.get(j) == null) {
                        flag = 1;
                        isVisited.put(j, ch);
                        break;
                    }
                }
            }
            if (flag == 0) {
                isAnagram = false;
                break;
            }
        }
        return isAnagram;
    }

    static boolean checkAnagramOptimized(String s1, String s2) {
/*   Time Complexity O(mxn)
     Space Complexity O(1)
*/
        int[] arr = new int[25];
        for (int i = 0; i < s1.length(); i++)
            arr[s1.charAt(i) - 'a']++;
        for (int j = 0; j < s2.length(); j++)
            arr[s2.charAt(j) - 'a']--;
        for (int count : arr) {
            if (count != 0)
                return false;
        }
        return true;
    }
}
