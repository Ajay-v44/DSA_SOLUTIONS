package String;

public class Leetcode1784 {
    public static boolean checkOnesSegment(String s) {
//        char[] cArray=s.toCharArray();
//        boolean isSegment=false;
//        for (int i = 0; i < cArray.length-1; i++) {
//            isSegment= cArray[i] == cArray[i + 1];
//        }
//    return  isSegment;

        int first = s.indexOf('1');
        int last = s.lastIndexOf('1');

        if (first == -1)
            return false;

        for (int i = first; i < last; i++) {
            if (s.charAt(i) == '0')
                return false;
        }
        return true;
    }

    static void main() {
        System.out.println(checkOnesSegment("00011"));
    }
}
