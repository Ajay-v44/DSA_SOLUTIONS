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
        } else {
            if (idx.isPresent()) {
                if (idx.get() <= 1) {
                    System.out.println("Not Possible should be greater than 1");
                    return;
                }
                Node temp = head;
                int index = 0;
                while (temp != null && index < idx.get() - 1) {
                    if (temp == tail)
                        temp = null;
                    else
                        temp = temp.next;
                    index += 1;
                }
                if (temp == null || temp.next == null) {
                    System.out.println("Out Of Bound");
                    return;
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
                head.prev = newNode;
                tail = newNode;
            }
        }
    }

    //    Delete Node
    public void deleteNode(Position ps, Optional<Integer> idx) {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        if (idx.isPresent()) {
            Node temp = head;
            int index = 0;
            while (temp != null && index < idx.get() - 1) {
                temp = temp == tail ? null : temp.next;
                index += 1;
            }
            if (temp == null) {
                System.out.println("Out Of Bound");
                return;
            }
            temp.next = temp.next.next;
            temp.next.prev = temp;
        } else if (ps.equals(Position.Head)) {
            head = head.next;
            head.prev = tail;
            tail.next = head;
        } else {
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
        }
    }

    //    Display
    public void printLinkedList() {
        Node temp = head;
        while (temp != null) {
            if (temp == tail) {
                System.out.print(" =>" + temp.data);
                temp = null;
            } else {
                System.out.print("=> " + temp.data);
                temp = temp.next;
            }
        }
        System.out.println();

    }

    //    Search A Data
    public void searchNode(int data) {
        boolean isFound = false;
        int idx=0;
        if (head != null) {
            Node temp = head;
            while (temp != null) {
                if (temp.data == data) {
                    isFound = true;
                    break;
                }
                temp = temp == tail ? null : temp.next;
                idx++;
            }
        }
        if (!isFound) {
            System.out.println("Element Is Not Present Here");
        } else {
            System.out.println("Element Found At "+idx+" Position");
        }
    }
}
