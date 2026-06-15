package LinkedList.leetcode;

import java.util.HashMap;
import java.util.Objects;

public class Leetcode2095 {
    public static ListNode deleteMiddle(ListNode head) {
        ListNode newHead = head;
        HashMap<Integer, ListNode> map = new HashMap<>();
        int i = 0;
        while (head != null) {
            map.put(i, head);
            i++;
            head = head.next;
        }
        int mid = i / 2;
        ListNode left = map.get(mid - 1);
        ListNode right = map.get(mid + 1);
         left.next = right;
        return newHead;
    }

    static void main() {
        ListNode nodeOne = new ListNode(1);
        ListNode nodeTwo = new ListNode(2);
        nodeOne.next = nodeTwo;
        ListNode nodeThree = new ListNode(3);
        ListNode nodeFour = new ListNode(4);
        nodeTwo.next = nodeThree;
        nodeThree.next = nodeFour;

        ListNode newHead = deleteMiddle(nodeOne);
        while (newHead != null) {
            System.out.println(newHead.val);
            newHead = newHead.next;
        }

    }
}
