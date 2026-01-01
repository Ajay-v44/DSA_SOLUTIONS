package TwoPointer;

import java.util.Arrays;

public class MaximumPlayersMatching {
    public static void main(String[] args) {
        int[] players = {4, 7, 9};
        int[] trainers = {8, 2, 5, 8};
        System.out.println(findMaximumMatches(players, trainers));
    }

    static int findMaximumMatches(int[] players, int[] trainers) {
        int count = 0;
        Arrays.sort(players);
        Arrays.sort(trainers);
        int pL=players.length,tL=trainers.length;
        int p=0,t=0;
        while (p<pL){
            while (t<tL){
                if(players[p]<=trainers[t]){
                    count++;
                    t++;
                    break;
                }
                t++;
            }
            p++;
        }

        return count;
    }
}
