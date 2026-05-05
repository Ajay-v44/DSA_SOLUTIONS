package LinkedList.leetcode;

public class Leetcode61 {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) return head;

        for (int i = 0; i < k; i++) {
            ListNode temp = head;
            ListNode prev = head;
            while (temp.next != null) {
                prev = temp;
                temp = temp.next;
            }
            prev.next = null;
            temp.next = head;
            head = temp;

        }
        return head;
    }

    public ListNode rotateRightOpt(ListNode head, int k) {
        if (head == null || head.next == null) return head;

        int l = 1;
        ListNode temp = head;
        while (temp.next != null) {
            l++;
            temp = temp.next;
        }

        temp.next = head;
        k = k % l;

        if (k == 0) return head;

        int newTail = l - k - 1;
        ListNode newHead ;

        for (int i = 0; i < newTail; i++) {
            head = head.next;
        }

        newHead = head.next;
        head.next = null;


        return newHead;
    }

    static void main() {

    }
}
