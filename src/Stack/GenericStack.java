package Stack;

public class GenericStack <T>{
    int maxSize;
    T[] arr;
    int top;

   public GenericStack(int maxSize) {
        this.maxSize=maxSize;
        this.arr = (T[]) new Object[maxSize];
        this.top = 0;
    }

    private boolean isEmpty() {
        return top == 0;
    }

    public void push(T ele) {
        if (top == maxSize)
            System.out.println("Stack Overflow");
        else
            arr[top++] = ele;
    }

    public void pop() {
        if (isEmpty())
            System.out.println("StackUnderFlow");
        else
            arr[top--] = null;
    }

    public void display() {
        for (int i = 0; i <top; i++) {
            System.out.print(arr[i]);
        }
    }

}
