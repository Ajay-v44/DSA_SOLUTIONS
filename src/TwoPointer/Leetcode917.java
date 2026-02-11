package TwoPointer;

public class Leetcode917 {

    public static boolean isAlpha(char c) {
        return Character.isLetter(c);
    }

    public static String reverseOnlyLetters(String s) {
        char[] arr=s.toCharArray();
        int i = 0;
        int j = s.length()-1;
        while (i < j) {
            char c = arr[i];
            char temp = arr[j];
            if(!isAlpha(temp)){
                j--;
            } else if(!isAlpha(c)){
                i++;
            } else {
                arr[j]=c;
               arr[i]=temp;
                j--;
                i++;
            }

        }
        return new String(arr);
    }

    static void main() {
        System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));
    }
}
