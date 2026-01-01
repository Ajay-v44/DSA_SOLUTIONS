package LinkedList.leetcode;

import java.util.LinkedList;

public class ReverseLinkedList {
    public ListNode reverseLST(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return next;
    }
}
