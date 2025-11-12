package LinkedList.leetcode;

public class LeetCode203 {
    //        if (head.val == val) {
//            head=head.next;
//            removeElements(head,val);
//        }else {
//            removeElements(head.next,val);
//        }
    public static ListNode removeElements(ListNode head, int val) {
        if (head == null)
            return null;
        ListNode prev=null;
        ListNode temp=head;
        while (temp!=null){
            if (temp.val==val){
                if(prev==null){
                    head=head.next;
                }else {
                    prev.next=temp.next;
                }
            }else {
                prev=temp;
            }
            temp=temp.next;
        }
        return head;
    }
    public static ListNode removeElementsOpt(ListNode head, int val) {
        if (head == null)
            return null;
        ListNode dummy=new ListNode(0,head);
        ListNode current=dummy;
        while (current.next!=null){
            if(current.next.val==val){
                current.next=current.next.next;
            }else {
                current=current.next;
            }
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(2);
        l1.next=l2;
        ListNode l3=new ListNode(3);
        ListNode l4=new ListNode(2);
        l2.next=l3;
        l3.next=l4;
        LeetCode3217.displayLinkedList(removeElementsOpt(l1,2));
    }
}
