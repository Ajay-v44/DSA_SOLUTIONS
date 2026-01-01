package LinkedList.leetcode;

public class SumOfLinkedList {
    public static void sumRemaining(ListNode l1, ListNode prev, int quotient) {
        while (l1 != null) {
            int sum = l1.val + quotient;
            ListNode newNode = new ListNode(sum % 10);
            quotient = sum / 10;
            prev.next = newNode;
            prev = newNode;
            l1 = l1.next;
        }
        if (quotient > 0) {
            prev.next = new ListNode(quotient);

        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//        if ((l1.val == 0) && (l2.val == 0)) {
//            return l1;
//        }
        int quotient = 0;
        ListNode head = null;
        ListNode prev = null;
        while (l1 != null && l2 != null) {
            int sum = l1.val + l2.val + quotient;
            ListNode newNode = new ListNode(sum % 10);
            quotient = sum / 10;
            if (head == null) {
                head = newNode;
                prev = head;
            } else {
                prev.next = newNode;
                prev = newNode;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l1 != null) {
            sumRemaining(l1, prev, quotient);
        } else if (l2 != null) {
            sumRemaining(l2, prev, quotient);
        } else {
            if (quotient > 0) {
                prev.next = new ListNode(quotient);

            }
        }
        return head;
    }

    public static void displayLinkedList(ListNode lst) {
        if (lst == null) {
            return;
        }
        while (lst != null) {
            System.out.println(lst.val);
            lst = lst.next;
        }
    }

    public static void main(String[] args) {
        ListNode l1One = new ListNode(0);
        ListNode l1Two = new ListNode(8);
        l1One.next = l1Two;

        ListNode l2One = new ListNode(0);
        ListNode l2Two = new ListNode(9);
        l2One.next = l2Two;
        ListNode result = addTwoNumbers(l1One, l2One);
        displayLinkedList(result);

    }
}
