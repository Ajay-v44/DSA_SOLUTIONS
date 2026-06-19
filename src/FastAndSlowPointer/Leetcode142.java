package FastAndSlowPointer;

import LinkedList.leetcode.ListNode;

public class Leetcode142 {
    public ListNode detectCycle(ListNode head) {
        ListNode fastP = head;
        ListNode slowP = head;
        boolean isCycle = false;

        while (fastP != null && fastP.next != null) {
            slowP = slowP.next;
            fastP = fastP.next.next;
            if(fastP==slowP){
                isCycle=true;
                break;
            }

        }

        if (!isCycle)
            return null;

        slowP = head;
        while (slowP != fastP) {
            slowP = slowP.next;
            fastP = fastP.next;
        }

        return slowP;
    }

    static void main() {

    }
}
