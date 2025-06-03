package String;


import utils.ScannerUtil;

public class MinChars {
    public static void main(String[] args) {
        ScannerUtil obj=new ScannerUtil();
        String str= obj.getAStringInput();
        System.out.println(findCharactersToAdd(str));
    }
    static int findCharactersToAdd(String s1){
        int number=0;
        StringBuilder sb=new StringBuilder(s1);
        if(sb.toString().contentEquals(sb.reverse())){
            return 0;
        }
        int i=sb.length()-1;
        while (i>0){
            number+=1;
            sb.insert(0,sb.charAt(i));
            if(sb.toString().contentEquals(sb.reverse())){
                break;
            }
            i--;
        }
        return number;
    }
}
