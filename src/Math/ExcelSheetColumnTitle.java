package Math;

public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        System.out.println(findColumnTitle(260));
    }
    static String findColumnTitle(int number){
        StringBuilder str=new StringBuilder();
        while (number>0){
            number--;
            str.append((char) (number%26+'A'));
            number/=26;
        }
        return str.reverse().toString();
        
    }
}
