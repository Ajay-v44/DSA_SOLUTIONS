package Stack;

public class Main {
    public static void main(String[] args) {
        Stack obj=new Stack(3);
        obj.pop();
//        obj.display();
        obj.push(2);
        obj.push(5);
        obj.push(6);
        obj.display();
    }
}
