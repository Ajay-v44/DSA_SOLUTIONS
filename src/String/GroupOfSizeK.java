package String;

import java.util.ArrayList;
import java.util.Arrays;

public class GroupOfSizeK {
    public static void main(String[] args) {
       String s = "abcdefghi";
       int k = 3;
       char fill = 'x';
        System.out.println(Arrays.toString(divideAString(s, k, fill)));
    }
    static String[] divideAString(String str, int k, char fill){
        if (str==null||str.isEmpty()){
            return new String[0];
        }
        ArrayList<String> result= new ArrayList<>();
        StringBuilder temp= new StringBuilder();
        for(char c :str.toCharArray()){
            temp.append(c);
            if(temp.length()==k){
                result.add(temp.toString());
                temp=new StringBuilder();
            }
        }
        if(!temp.isEmpty()) {
            while (temp.length() < k) {
                temp.append(k);
            }
            result.add(temp.toString());
        }
        return result.toArray(new String[0]);
    }
}
