package String;

public class Leetcode2124 {
    public static boolean checkString(String s) {
        boolean foundB=false;
        for (int i = 0; i < s.length(); i++) {
            if (foundB && s.charAt(i) =='a' )
                return  false;
            if(!foundB && s.charAt(i) =='b' )
                foundB=true;

        }
        return true;
    }

    static void main() {
        System.out.println(checkString("ababbb"));
    }
}
