package Stack;

public class QueueUsingStack {
    Stack s1;
    Stack s2;

    protected class Stack {
        int top;
        int size;
        int[] stack;

        Stack(int size) {
            top = -1;
            this.size = size;
            stack = new int[this.size];
        }

        public boolean isEmpty() {
            return top == -1;
        }

        public void push(int ele) {
            stack[++top] = ele;
        }

        public int peek() {
            if (isEmpty())
                return -1;
            return stack[top];
        }

        public int pop() {
            if (isEmpty())
                return -1;
            return stack[top--];
        }
    }

    public QueueUsingStack() {
        this(50);
    }

    public QueueUsingStack(int size) {
        s1 = new Stack(size);
        s2 = new Stack(size);

    }

    public void push(int x) {
        s1.push(x);
    }

    public void pushAndPop() {
        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
    }

    public int pop() {
        pushAndPop();
        return s2.pop();
    }

    public int peek() {
        pushAndPop();
        return s2.peek();
    }

    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}
