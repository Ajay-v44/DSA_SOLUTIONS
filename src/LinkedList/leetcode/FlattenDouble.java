package LinkedList.leetcode;

import LinkedList.leetcode.DobleNode.Node;

public class FlattenDouble {
    public Node flatten(Node head) {
        if (head == null)
            return null;
        Node current = head;
        while (current != null) {
            if (current.child != null) {
                Node next = current.next;
                current.next = flatten(current.child);
                current.next.prev = current;
                while (current.next != null) {
                    current = current.next;
                }
                if (next != null) {
                    current.next = next;
                    next.prev = current;
                }
            }
            current = current.next;
        }
        return head;
    }
}
