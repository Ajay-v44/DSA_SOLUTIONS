package Math;

public class StringGameOne {
    public static void main(String[] args) {
        System.out.println(findCharAtK(5));
    }
    static char findCharAtK(int k){
        StringBuilder str=new StringBuilder("a");
        for(int i=0;i<k;i++){
            int len=str.length();
            int start=0;
            while(start<len){
                if(str.charAt(start)=='z'){
                    str.append('a');
                }else{
                    str.append((char) ((int)str.charAt(start) + 1));
                }
                start+=1;
            }
        }
        return str.charAt(k-1);
    }
}
