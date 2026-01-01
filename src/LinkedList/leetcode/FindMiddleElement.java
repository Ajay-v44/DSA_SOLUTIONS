package LinkedList.leetcode;

public class FindMiddleElement {
    //    Fast And Slow Pointer Approach
//    TC- O(n) SC - O(1)
    public ListNode findMiddle(ListNode head) {
        ListNode slowP = head;
        ListNode fastP = head;
        while (fastP != null && fastP.next != null) {
            slowP = slowP.next;
            fastP = fastP.next.next;
        }
        return slowP;
    }
}
