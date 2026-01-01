package LinkedList.leetcode;

public class SwapNodes {
    public ListNode swapNode(ListNode head){
        if(head==null||head.next==null)
            return head;
        ListNode prev=head.next;
        head.next=swapNode(head.next.next);
        prev.next=head;
        return prev;
    }
}
