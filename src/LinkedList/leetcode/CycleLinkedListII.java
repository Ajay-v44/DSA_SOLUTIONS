package LinkedList.leetcode;

import java.util.HashMap;

public class CycleLinkedListII {
    //    Leet Code 142. Linked List Cycle II
    public ListNode hasCycle(ListNode head) {
        HashMap<String, Integer> record = new HashMap<>();
        ListNode cycleNode = null;
        int pos = 0;
        while (head != null && head.next != null) {
            if (record.containsKey(head.toString())) {
                cycleNode = head;
//                pos = record.get(head.toString());
                break;
            }
            record.put(head.toString(), pos);
            head = head.next;
            pos++;
        }
        System.out.println(pos);
        return cycleNode;
    }

    //Fast and slow pointer approach
    public ListNode hasCycleOpt(ListNode head) {
        ListNode fastP = head;
        ListNode slowP = head;
        boolean isCycle = false;
        while (fastP != null && fastP.next != null) {
            fastP = fastP.next.next;
            slowP = slowP.next;
            if (fastP == slowP) {
                isCycle = true;
                break;
            }
        }
        if (!isCycle) {
            return null;
        }
        slowP = head;
        while (slowP != fastP) {
            slowP = slowP.next;
            fastP = fastP.next;
        }
        return slowP;
    }
}