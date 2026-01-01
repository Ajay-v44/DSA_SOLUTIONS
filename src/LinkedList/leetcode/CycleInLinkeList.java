package LinkedList.leetcode;

import java.util.HashMap;

public class CycleInLinkeList {
    //    LeetCode 141
//    Space Complexity - O(1)
//    Time Complexity - O(n)
    public boolean hasCycle(ListNode head) {
        boolean isPresent = false;
        HashMap<String, Integer> record = new HashMap<>();
        int pos = 0;
        while (head != null && head.next != null) {
            if (record.containsKey(head.toString())) {
                isPresent = true;
                pos = record.get(head.toString());
                break;
            }
            record.put(head.toString(), pos);
            head = head.next;
            pos++;
        }
        System.out.println(pos);
        return isPresent;
    }

    public boolean hasCycleOpt(ListNode head) {
        boolean hasCycle = false;
        ListNode slowP = head;
        ListNode fastP = head;
        while (fastP != null && fastP.next != null) {
            fastP = fastP.next.next;
            slowP = slowP.next;
            if (fastP==slowP) {
                hasCycle = true;
                break;
            }
        }
        return hasCycle;
    }
}
