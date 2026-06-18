package FastAndSlowPointer;

import LinkedList.leetcode.ListNode;

public class Leetcode141 {
    public boolean hasCycle(ListNode head) {

        ListNode fastPointer = head;
        ListNode slowPointer = head;

        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;

            if (slowPointer == fastPointer)
                return true;
        }
        return false;
    }

    static void main() {

    }
}
