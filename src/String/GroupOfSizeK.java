package String;

import java.util.ArrayList;
import java.util.Arrays;

public class GroupOfSizeK {
    public static void main(String[] args) {
       String s = "abcdefghi";
       int k = 3;
       char fill = 'x';
        System.out.println(divideAString(s, k, fill));
    }
    static ArrayList<String> divideAString(String str, int k, char fill){
        ArrayList<String> result= new ArrayList<>();
        int inc=0;
        StringBuilder temp= new StringBuilder();
        for(char c :str.toCharArray()){
            System.out.println(inc);
            if (inc==k){
                System.out.println(temp);
                result.add(temp.toString());
                inc=0;
                temp = new StringBuilder();
//                continue;
            }
            temp.append(c);
            inc++;

        }
        if(result.get(-1).length()<k){
            int rem=k-result.get(-1).length();
            StringBuilder item= new StringBuilder(result.get(-1));
            for (int num=0;num<rem;num++){
                item.append(fill);
            }
            result.add(-1, String.valueOf(item));
        }
        return result;
    }
}
