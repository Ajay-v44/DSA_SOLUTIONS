package Stack;

public class ValidParanthesis {
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
            if (top == maxSize-1)
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

    public boolean isValid(String s) {
        int len = s.length();
        if (len < 1)
            return false;
        GenericStack<Character> obj = new GenericStack<>(len);
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (c == '{' || c == '[' || c == '(') {
                obj.push(c);
            } else {
                if (obj.isEmpty())
                    return false;
                char prev = obj.pop();
                if (c == '}' && prev != '{')
                    return false;
                else if (c == ']' && prev != '[')
                    return false;
                else if (c == ')' && prev != '(')
                    return false;
            }
        }
        return obj.isEmpty();
    }

    public static void main(String[] args) {
        String test = "()";
        ValidParanthesis obj = new ValidParanthesis();
        System.out.println(obj.isValid(test));
    }

}
