package String;

public class FancyString {
    public static void main(String[] args) {
        System.out.println(createFancyString("aaa"));
    }

    static String createFancyString(String str) {
        if (str.length() > 2) {
            char[] charArray = str.toCharArray();
            int count = 0;
            char prev=charArray[0];
            StringBuilder newString= new StringBuilder();
            for (char ch : charArray) {
                if(ch==prev){
                    count+=1;
                    if(count<3){
                        newString.append(ch);
                    }
                }else{
                    prev=ch;
                    newString.append(ch);
                    count=1;
                }
            }
            return newString.toString();
        }
        return str;
    }
}
