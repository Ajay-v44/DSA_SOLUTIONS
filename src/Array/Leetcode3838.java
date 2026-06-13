package Array;

import java.util.HashMap;

public class Leetcode3838 {
    public static String mapWordWeights(String[] words, int[] weights) {
        StringBuffer result=new StringBuffer();
        for (String word:words){
            int sum=0;
            for (int i = 0; i < word.length(); i++) {
                sum+=weights[word.charAt(i)-'a'];
            }
            int remainder=sum%26;
            char mappedChar = (char) ('z' - remainder);
            result.append(mappedChar);
        }
        return result.toString();
    }

    static void main() {
        String[] words={"abcd","def","xyz"};
        int[] weights={5,3,12,14,1,2,3,2,10,6,6,9,7,8,7,10,8,9,6,9,9,8,3,7,7,2};
        System.out.println(mapWordWeights(words,weights));

    }
}
