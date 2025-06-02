package String;

import java.util.Scanner;

public class StringRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two Strings  \t:");
        String s1 = sc.next();
        String s2 = sc.next();
        if (isEqualStringsLC(s1, s2))
            System.out.println("Equal");
        else
            System.out.println("No Equal");

    }

    static boolean isEqualStringsLC(String s1, String s2) {
//   Leet Code -     796. Rotate String
        if (s1.length() != s2.length())
            return false;
        if (s1.equals(s2))
            return  true;
        StringBuilder str = new StringBuilder(s1);
        int i = 0;
        while (i < s1.length()) {
            char ch = str.charAt(0);
            str.deleteCharAt(0);
            str.append(ch);
            i++;
            if (str.toString().equals(s2)) {
                return true;
            }
        }
        return false;
    }
}
