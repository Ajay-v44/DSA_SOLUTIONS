package LinkedList.Double;

import java.util.Optional;

public class DoubleLinkedList {
    Node head = null;
    Node tail = null;

    //    Insertion
    public void insertNode(int data, Position ps, Optional<Integer> index) {
        Node newNode = new Node(data);
        //        Insert At A Particular Position
        if (index.isPresent()) {
            int idx = 0;
            Node temp = head;
            while (temp != null && idx < index.get() - 1) {
                idx += 1;
                temp = temp.next;
            }
            if (temp == null || temp.next == null) {
                System.out.println("Out Of Bound");
            }
            newNode.next = temp.next;
            newNode.prev = temp;
            temp.next = newNode;
            temp.next.prev = newNode;
        } else {
//            Insert At Head
            if (ps.equals(Position.Head)) {
                if (head == null) {
                    head = tail = newNode;
                } else {
                    head.prev = newNode;
                    newNode.next = head;
                    head = newNode;
                }
            } else {
//                    Insert At Tail
                if (head == null) {
                    head = tail = newNode;
                } else {
                    tail.next = newNode;
                    newNode.prev = tail;
                    tail = newNode;
                }
            }
        }
    }

    public void printNodes(Position ps) {
        Node temp = head;
        Node tempTail = tail;
        if (ps.equals(Position.Head)) {
            while (temp != null) {
                if (temp.next == null)
                    System.out.println(temp.data);
                else
                    System.out.print(temp.data + " =>");
                temp = temp.next;
            }
        } else {
            while (tempTail != null) {
                if (tempTail.prev == null)
                    System.out.println(tempTail.data);
                else
                    System.out.println(tempTail.data + " =>");
                tempTail = tempTail.prev;
            }
        }

    }


//    Delete Node
    public void deleteNode(Position ps, Optional<Integer> index){
        if(head==null||tail==null){
            System.out.println("Linked List Is Empty");
            return;
        }
        if(index.isPresent()){
            Node temp=head;
            int idx=0;
            while (temp.next!=null&&idx<index.get()-1){
                temp=temp.next;
                idx+=1;
            }
            if(temp==null||temp.next==null){
                System.out.println("Out Of Bound");
            }
            temp.next=temp.next.next;
            temp.next.prev=temp;

        }else{
            if(ps.equals(Position.Head)){
                head=head.next;
                head.prev=null;
            }else{
                tail=tail.prev;
                tail.next=null;
            }
        }
    }
}
