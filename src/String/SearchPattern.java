package String;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The String And Pattern \n");
        String str = sc.next();
        String pattern = sc.next();
        System.out.println(findPatterns(str, pattern));
        System.out.println(searchPatternGFG(str, pattern));

    }

    static ArrayList<Integer> findPatterns(String s1, String pattern) {
        ArrayList<Integer> lst = new ArrayList<>();
        int i = 0, temp = 0, ptl = 0;
        while (i < s1.length()) {
            if (s1.charAt(i) != pattern.charAt(ptl)) {
                i = temp + 1;
                temp++;
                ptl = 0;
                continue;
            }
            if (ptl == pattern.length() - 1) {
                lst.add(temp);
                temp = i;
                ptl = 0;
                continue;
            }
            i++;
            ptl++;
        }
        return lst;
    }

    public int findPatternLC(String s1, String pattern) {
/*        leetcode 28

28. Find the Index of the First Occurrence in a String
 */
        int i = 0, temp = 0, ptl = 0;
        while (i < s1.length()) {
            if (s1.charAt(i) != pattern.charAt(ptl)) {
                i = temp + 1;
                temp++;
                ptl = 0;
                continue;
            }
            if (ptl == pattern.length() - 1) {
                return temp;
            }
            i++;
            ptl++;
        }
        return -1;
    }
//    KMP Algorithm
    static void constructLPS(String pat,int[] lps){
        int len=0;
        lps[0]=0;
        int i=1;
        while(i<pat.length()){
            if(pat.charAt(i)==pat.charAt(len)){
                len++;
                lps[i]=len;
                i++;
            }else{
                if(len!=0){
                    len=lps[len-1];
                }else{
                    lps[i]=0;
                    i++;
                }
            }
        }
    }
    static ArrayList<Integer> searchPatternGFG(String str, String pattern) {
        ArrayList<Integer> res=new ArrayList<>();
        int n=str.length();
        int m=pattern.length();
        int[] lps=new int[m];
        constructLPS(pattern,lps);
        int i=0;
        int j=0;
        while(i<n){
            if(str.charAt(i)==pattern.charAt(j)){
                i++;
                j++;
                if(j==m){
                    res.add(i-j);
                    j=lps[j-1];
                }
            }else{
                if(j!=0){
                    j=lps[j-1];
                }else{
                    i++;
                }
            }
        }

        return res;
    }
}
