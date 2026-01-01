package Stack;

public class ReverseString {
    public static void main(String[] args) {
        char[] ch={'a','j','a','y'};
        GenericStack<Character> obj= new GenericStack<Character>(4);
        for (int i = ch.length-1; i >=0 ; i--) {
            obj.push(ch[i]);
        }
        obj.display();
    }
}
