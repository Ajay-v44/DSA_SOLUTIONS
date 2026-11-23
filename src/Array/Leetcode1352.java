package Array;

import java.util.ArrayList;
import java.util.List;

public class Leetcode1352 {
    List<Integer> list;

    public Leetcode1352() {
        list = new ArrayList<>();
    }

    public void add(int num) {
        list.add(num);
    }

    public int getProduct(int k) {
        int prod = 1;
        int moves=1;
        int i = list.size() - 1;
        while (moves<=k && i>=0){
            prod *= list.get(i);
            i-=1;
            moves+=1;
        }
//        for (int i = list.size() - 1; i >= 0; i--) {
//            System.out.println(list.get(i));
//            prod *= list.get(i);
//        }
        return prod;
    }

    static void main() {
        Leetcode1352 obj=new Leetcode1352();
        obj.add(3);
        obj.add(0);
        obj.add(2);
        obj.add(5);
        obj.add(4);
        System.out.println(obj.getProduct(3));

    }
}
