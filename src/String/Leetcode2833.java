package String;

public class Leetcode2833 {
    public static int furthestDistanceFromOrigin(String moves) {
        int L = 0;
        int R = 0;
        int us = 0;
        for (int i = 0; i < moves.length(); i++) {
            if (moves.charAt(i) == 'L') {
                L++;
            } else if (moves.charAt(i) == 'R') {
                R++;
            } else {
                us++;
            }
        }
        if(L>R){
            L+=us;
            return L-R;
        }else if(R>L) {
            R+=us;
            return  R-L;
        }
        return us;
    }

    static void main() {
        System.out.println(furthestDistanceFromOrigin("L_RL__R"));
    }
}
