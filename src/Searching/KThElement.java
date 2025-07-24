package Searching;

import java.util.PriorityQueue;

public class KThElement {
    public static void main(String[] args) {
        int[] arrayOne={1,2,3};
        int[] arrayTwo={4,5,6};
        int k=3;
        System.out.println(findKthElement(arrayOne,arrayTwo,k));
    }
    static int findKthElement(int[] arrayOne,int[] arrayTwo,int k ){
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i:arrayOne)
            pq.add(i);
        for (int i:arrayTwo)
            pq.add(i);
        while (k-->1){
            pq.poll();
        }
        return pq.peek();
    }
}
