package TwoPointer;

public class ReverseString {
    public  static void reverseString(char[] s){
        int length=s.length;
        if(length>1){
            int current=0;
            int last=length-1;
            while (current<last){
                char temp=s[last];
                s[last--]=s[current];
                s[current++]=temp;
            }
        }
    }

    public static void main(String[] args) {
        char[] s={'a','j','a','y'};
        reverseString(s);
        System.out.println(s);
    }
}
