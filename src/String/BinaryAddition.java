package String;


import java.util.Scanner;

// Leet Code - 67. Add Binary
//Time Complexity 0(max(n,m))
public class BinaryAddition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The 2 Binary numbers \t");
        String s1=sc.next();
        String s2=sc.next();

        System.out.println(addBinary(s1,s2));
    }
    public  static  String addBinary(String s1,String s2){
        StringBuilder result=new StringBuilder();
        int carry=0;
        int i=s1.length()-1;
        int j=s2.length()-1;

        while (i>=0||j>=0||carry!=0){
            int bitOne=i>=0?s1.charAt(i)-'0':0;
            int bitTwo=j>=0?s2.charAt(j)-'0':0;

            int sum=bitOne+bitTwo+carry;
            result.append(sum%2);
            carry=sum/2;
            i--;
            j--;
        }
        result.reverse();
        while (result.length()>1&&result.charAt(0)=='0'){
            result.deleteCharAt(0);
        }

        return result.toString();
    }
}
