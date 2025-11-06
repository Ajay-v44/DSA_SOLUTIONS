package String;

import java.util.stream.IntStream;

public class SumChar {
    public  static int scoreOfString(String s) {
//        int sum=0;
//        for (int i = 0; i < s.length()-1; i++) {
//            sum+=Math.abs((s.charAt(i)-s.charAt(i+1)));
//        }
//        return sum;

        return IntStream.range(0,s.length()-1)
                .map(i->Math.abs(s.charAt(i)-s.charAt(i+1)))
                .sum();
    }

    public static void main(String[] args) {
        System.out.println(scoreOfString("hello"));
    }
}

