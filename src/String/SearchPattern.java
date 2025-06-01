package String;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String And Pattern \n");
        String str = sc.next();
        String pattern = sc.next();
        System.out.println(findPatterns(str, pattern));

    }

    static ArrayList<Integer> findPatterns(String s1, String pattern) {
        ArrayList<Integer> lst = new ArrayList<>();
        int i = 0, temp = 0, ptl = 0;
        while (i < s1.length()) {
            if (s1.charAt(i) != pattern.charAt(ptl)) {
                i = temp + 1;
                temp++;
                ptl = 0;
                continue;
            }
            if (ptl == pattern.length() - 1) {
                lst.add(temp);
                temp = i;
                ptl = 0;
                continue;
            }
            i++;
            ptl++;
        }
        return lst;
    }

    public int strStr(String s1, String pattern) {
/*        leetcode 28

28. Find the Index of the First Occurrence in a String
 */
        int i = 0, temp = 0, ptl = 0;
        while (i < s1.length()) {
            if (s1.charAt(i) != pattern.charAt(ptl)) {
                i = temp + 1;
                temp++;
                ptl = 0;
                continue;
            }
            if (ptl == pattern.length() - 1) {
                return temp;
            }
            i++;
            ptl++;
        }
        return -1;
    }
}
