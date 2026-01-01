package String;

public class Maximum69Number {
    public static void main(String[] args) {
        int num = 9669;
        System.out.println(Maximum69NumberAction(num));
    }

    static int Maximum69NumberAction(int number) {
        StringBuffer str = new StringBuffer(Integer.toString(number));
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '6') {
                str.deleteCharAt(i);
                str.insert(i, '9');
                break;
            }
        }
        String str1 = str.toString();
        return Integer.parseInt(str1);
    }
}
