package String;

public class PossibleStringCount {
    public static void main(String[] args) {
        System.out.println(findMaxOccurrence("abbcccc"));
    }
    static int findMaxOccurrence(String str){
        int length=str.length();
        int count=length;
        for(int i=1;i<length;i++){
            if(str.charAt(i)!=str.charAt(i-1)){
                count--;
            }
        }
        return count;
    }
}
