package Stack;

import java.util.Objects;

public class RPN {
    public class GenericStack<T> {
        int maxSize;
        T[] arr;
        int top;

        public GenericStack(int maxSize) {
            this.maxSize = maxSize;
            this.arr = (T[]) new Object[maxSize];
            this.top = -1;
        }

        private boolean isEmpty() {
            return top == -1;
        }

        public void push(T ele) {
            if (top == maxSize - 1)
                System.out.println("Stack Overflow");
            else
                arr[++top] = ele;
        }

        public T pop() {
            if (isEmpty()) {
                System.out.println("StackUnderFlow");
                return null;
            }
            T element = arr[top];
            arr[top--] = null;
            return element;
        }

        public void display() {
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i]);
            }
        }

    }

    public int evalRPN(String[] tokens) {
        int len = tokens.length;
        if (len < 1)
            return 0;
        GenericStack<Integer> stack = new GenericStack<>(len);
        for (int i = 0; i < len; i++) {
            String ele = tokens[i];
            switch (ele) {
                case "+" -> {
                    if (stack.isEmpty())
                        return 0;
                    stack.push(stack.pop() + stack.pop());
                }
                case "-" -> {
                    if (stack.isEmpty())
                        return 0;
                    int b=stack.pop();
                    int a=stack.pop();
                    stack.push(a - b);
                }
                case "*" -> {
                    if (stack.isEmpty())
                        return 0;
                    int b=stack.pop();
                    int a=stack.pop();
                    stack.push(a*b);
                }
                case "/" -> {
                    if (stack.isEmpty())
                        return 0;
                    int b=stack.pop();
                    int a=stack.pop();
                    stack.push( a/ b);
                }
                case null, default -> stack.push(Integer.parseInt(ele));
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String[] arr={"2","1","+","3","*"};
        RPN obj=new RPN();
        System.out.println(obj.evalRPN(arr));
    }
}
