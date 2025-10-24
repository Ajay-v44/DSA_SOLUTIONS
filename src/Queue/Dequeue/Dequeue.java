package Queue.Dequeue;

public class Dequeue {
    int rear;
    int front;
    int[] arr;
    int top;
    int maxSize;

    public Dequeue(int maxSize) {
        this.maxSize = maxSize;
        arr = new int[maxSize];
        front = -1;
        rear = -1;
        top = 0;
    }

    private boolean isFull() {
        return top == maxSize;
    }

    //insertion at front
    public void insertionAtFront(int ele) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (top == 0) {
            front = 0;
            rear = 0;
        } else if (front == 0) {
            front = maxSize - 1;
        } else {
            front--;
        }

        arr[front] = ele;
        top++;
    }

    //    insertion at end
    public void insertionAtEnd(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (top == 0) {
            front = 0;
            rear = 0;
        } else if (rear == maxSize - 1) {
            rear = 0;
        } else {
            rear++;
        }
        arr[rear] = data;
        top++;
    }

    //    deletion at front
    public int deletionAtFront() {
        if (top == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int ele=arr[front];
        arr[front]=0;
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (front == maxSize - 1) {
            front = 0;
        } else {
            front++;
        }
        top--;
        return ele;
    }

    //    deletion at rear
    public int deletionAtRear() {
        if (top == 0) {
            System.out.println("Queue is empty");
            return -1;
        }
        int ele=arr[rear];
        arr[rear]=0;
        if (front == rear) {
            front = -1;
            rear = -1;
        } else if (rear == 0) {
            rear = maxSize - 1;
        } else {
            rear--;
        }
        top--;
        return ele;
    }

    public void display() {
        if(top==0){
            System.out.println("Empty Queue");
            return;
        }
        for (int i = 0; i < maxSize; i++) {
            System.out.print(arr[(front + i) % maxSize] + "\t");
        }
        System.out.println();
    }

}
