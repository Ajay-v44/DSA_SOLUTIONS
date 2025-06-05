package Sorting;

public class HIndex {
    public static void main(String[] args) {
        int[] citations={6, 0, 3, 5, 3};
        System.out.println(findHIndex(citations));
    }
    static int findHIndex(int[] citations){
        int len=citations.length;
        int[] freq=new int[len+1];
        for(int i=0;i<len;i++){
            if(citations[i]>=len){
                freq[len]+=1;
            }else {
                freq[citations[i]]+=1;
            }
        }
        int idx=len;
        int s=freq[len];
        while (s<idx){
            idx--;
            s+=freq[idx];
        }
        return idx;
    }
}
