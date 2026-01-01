package Queue;

import Queue.Circular.CircularQueue;
import Queue.Dequeue.Dequeue;

public class Queue {
    public static void main(String[] args) {
//        ArrayQueue<Integer> queue=new ArrayQueue<Integer>(5);
////        System.out.println(queue.deQueue());
//        queue.enQueue(1);
//        queue.enQueue(2);
//        queue.enQueue(3);
//        queue.enQueue(4);
//        queue.enQueue(5);
//        queue.display();
//        queue.deQueue();
//        queue.deQueue();
//        System.out.println("\n");
//        queue.display();

//
//        CircularQueue queue=new CircularQueue(5);
//        System.out.println(queue.deQueue());
//        queue.display();
//
//        queue.enQueue(5);
//        queue.enQueue(55);
//        queue.enQueue(555);
//        queue.enQueue(5555);
//        queue.display();
//        System.out.println();
//        System.out.println(queue.deQueue());
//        System.out.println();
//        queue.display();
//        queue.enQueue(55555);
//        queue.enQueue(555555);
//        queue.display();
//        System.out.println(queue.deQueue());
//        System.out.println();
//        queue.display();
//        queue.enQueue(44);
//        queue.enQueue(555555);
//        queue.display();

        Dequeue obj=new Dequeue(5);
        obj.deletionAtFront();
        obj.deletionAtRear();
        obj.display();
        obj.insertionAtFront(5);
        obj.insertionAtFront(6);
        obj.display();
        obj.insertionAtEnd(7);
        obj.insertionAtFront(10);
        obj.display();
//        obj.deletionAtFront();
        obj.display();
        System.out.println(obj.deletionAtRear());
        obj.display();
    }
}
