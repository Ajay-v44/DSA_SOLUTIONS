package Stack.LinkedList;

public class Main {
    public static void main(String[] args) {
        Stack stack=new Stack(5);
        stack.display();
        stack.pop();
        stack.push(5);
        stack.push(55);
        stack.push(555);
        stack.push(5555);
        stack.push(55555);
        stack.push(555555);
        stack.display();
        stack.pop();
        stack.display();
    }
}
