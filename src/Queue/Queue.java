package Queue;

public class Queue {
    public static void main(String[] args) {
        ArrayQueue<Integer> queue=new ArrayQueue<Integer>(5);
//        System.out.println(queue.deQueue());
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);
        queue.enQueue(4);
        queue.enQueue(5);
        queue.display();
        queue.deQueue();
        queue.deQueue();
        System.out.println("\n");
        queue.display();
    }
}
