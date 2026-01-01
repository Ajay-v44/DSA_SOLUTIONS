package Queue;

public class StackUsingQueue {
    Queue queue1;
    Queue queue2;

    protected class Queue {
        int size = 0;
        int[] arr;
        int rear = -1;
        int front = 0;
        int count = 0;

        Queue(int size) {
            this.size = size;
            arr = new int[size];
        }

        public boolean isEmpty() {
            return count == 0;
        }

        public boolean isFull() {
            return count == size;
        }

        public void enQueue(int ele) {
            if (isFull())
                return;
            rear = (rear + 1) % size;
            arr[rear] = ele;
            count++;
        }

        public int deQueue() {
            int item = arr[front];
            front = (front + 1) % size;
            count--;
            return item;
        }

        public int peek() {
            return arr[front];
        }
    }

    public StackUsingQueue() {
        this(50);
    }

    public StackUsingQueue(int size) {
        queue1 = new Queue(size);
        queue2 = new Queue(size);
    }

    public void push(int x) {
        queue2.enQueue(x);
        while (!queue1.isEmpty()) {
            queue2.enQueue(queue1.deQueue());
        }
        Queue temp = queue1;
        queue1 = queue2;
        queue2 = temp;
    }

    public int pop() {
        return queue1.deQueue();
    }

    public int top() {
        return queue1.peek();
    }

    public boolean empty() {
        return queue1.isEmpty();
    }

}
