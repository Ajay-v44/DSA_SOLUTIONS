package LinkedList.leetcode;

public class RemoveDuplicates {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode temp = head;
        while (temp.next != null) {
            if (temp.val == temp.next.val ) {
                temp.next = temp.next.next;
            }else {
                temp = temp.next;
            }
        }
        return head;
    }

    public static void display(ListNode head) {
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }

    }

    public static void main(String[] args) {
        ListNode nodeOne = new ListNode(1);
        ListNode nodeTwo = new ListNode(1);
        nodeOne.next = nodeTwo;
        ListNode nodeThree = new ListNode(1);
        ListNode nodeFour = new ListNode(13);
        nodeTwo.next=nodeThree;
        nodeThree.next = nodeFour;
        display(deleteDuplicates(nodeOne));
    }
}
