package LinkedList.leetcode;

import LinkedList.leetcode.Nodes.Node;

import java.util.HashMap;

public class CopyListWithRandomPointers {
    public Node copyRandomNodes(Node head) {
        if (head == null)
            return null;
        Node newHead = null;
        Node temp = head;
        Node prev = null;
        HashMap<Node, Node> bucket = new HashMap<>();

        while (temp != null) {
            Node newNode = new Node(temp.val);
            if (newHead == null) {
                newHead = newNode;
            } else {
                prev.next = newNode;
            }
            prev = newNode;
            bucket.put(temp, newNode);
            temp = temp.next;
        }
        temp = head;
        Node newTemp = newHead;
        while (temp != null && newTemp != null) {
            if (temp.random == null)
                newTemp.random = null;
            else {
                newTemp.random = bucket.get(temp.random);
            }
            temp = temp.next;
            newTemp = newTemp.next;
        }
        return newHead;
    }
}
