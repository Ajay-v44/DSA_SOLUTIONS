package Stack;

import java.util.Arrays;

public class Stack {
    int maxSize;
    int[] arr;
    int top;

    Stack(int maxSize) {
        this.maxSize=maxSize;
        this.arr = new int[maxSize];
        this.top = 0;
    }

    private boolean isEmpty() {
        return top == 0;
    }

    public void push(int ele) {
        if (top == maxSize)
            System.out.println("Stack Overflow");
        else
            arr[top++] = ele;
    }

    public void pop() {
        if (isEmpty())
            System.out.println("StackUnderFlow");
        else
            arr[top--] = 0;
    }

    public void display() {
        for (int i = 0; i <top; i++) {
            System.out.printf("\t%d",arr[i]);
        }
    }
}
