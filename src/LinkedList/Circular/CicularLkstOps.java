package LinkedList.Circular;

import LinkedList.Double.Position;

import java.util.Optional;

public class CicularLkstOps {
    Node head = null;
    Node tail = null;

    //    insertion
    public void insertNode(int data, Position ps, Optional<Integer> idx) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            head.prev = tail;
            tail.next = head;
        }
//        else if (head == tail) {
//            head.next = newNode;
//            newNode.prev = head;
//            newNode.next = head;
//            head.prev = newNode;
//        }
        else {
            if (idx.isPresent()) {
                Node temp = head;
                int index = 0;
                while (temp.next != head && idx.get() < index - 1) {
                    temp = temp.next;
                    index += 1;
                }
                if (temp == null || temp.next == null) {
                    System.out.println("Out Of Bound");
                }
                newNode.next = temp.next;
                temp.next = newNode;
                newNode.prev = temp;
                temp.next.prev = newNode;
            } else if (ps.equals(Position.Head)) {
                newNode.prev = tail;
                tail.next = newNode;
                head.prev = newNode;
                newNode.next = head;
                head = newNode;
            } else {
                newNode.next = head;
                newNode.prev = tail;
                tail.next = newNode;
                head.prev=newNode;
                tail = newNode;
            }
        }
    }

//    Display
    public void printLinkedList(){
        if(head==tail){
            System.out.println(head.data);
            return;
        }
        Node temp=head;
        while (temp!=tail){
            if(temp==tail)
                System.out.println(temp.data);
            else
                System.out.print("=> "+temp.data);
            temp=temp.next;
        }

    }
}
