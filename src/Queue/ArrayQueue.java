package Queue;

public class ArrayQueue<T> {
    private int maxSize;
    private T[] arr;
    private int rear;
    private int front;

    ArrayQueue(int maxSize) {
        this.maxSize = maxSize;
        arr = (T[]) new Object[maxSize];
        this.rear = 0;
        this.front = 0;
    }

    public void enQueue(T ele) {
        if (rear == maxSize) {
            System.out.println("Queue Is Full");
            return;
        }
        arr[rear++] = ele;
    }

    public T deQueue() {
        if (front > rear) {
            System.out.println("Queue Is Empty");
            return null;
        }
        return arr[front++];
    }

    public void display() {
        for (int i = front; i < rear; i++) {
            System.out.println(arr[i]);

        }
    }
}
