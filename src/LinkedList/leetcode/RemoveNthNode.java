package LinkedList.leetcode;

public class RemoveNthNode {
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null)
            return null;
        ListNode temp = head;
        int length = 0;
        int count = 0;
        while (temp != null) {
            length++;
            temp = temp.next;
        }
        if(n==length)
            return head.next;
        temp = head;
        while (temp != null) {
            count++;
            if (count == (length - n )) {
                if (temp.next!=null){
                    temp.next=temp.next.next;
                }
                break;
            }
            temp = temp.next;
        }
        return  head;
    }
    public static void display(ListNode head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }

    }
    public static void main(String[] args) {
        ListNode l1=new ListNode(1);
//        ListNode l2=new ListNode(2);
//        ListNode l3=new ListNode(3);
//        ListNode l4=new ListNode(4);
//        ListNode l5=new ListNode(5);
//        l1.next=l2;
//        l2.next=l3;
//        l3.next=l4;
//        l4.next=l5;
        display(removeNthFromEnd(l1,1));
    }
}
