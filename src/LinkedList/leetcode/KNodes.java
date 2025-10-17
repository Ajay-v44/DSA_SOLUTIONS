package LinkedList.leetcode;

public class KNodes {
    public ListNode reverseNode(ListNode head, int k) {
        if (head == null)
            return null;
        ListNode temp = head;
        int count = 0;

        while (count < k) {
            if (temp == null)
                return head;
            temp = temp.next;
            count++;
        }

        ListNode nextNode = reverseNode(temp, k);

        temp = head;
        count = 0;
        ListNode current;
        while (count < k) {
            current = temp.next;
            temp.next = nextNode;
            nextNode = temp;
            temp = current;
            count++;
        }

        return nextNode;
    }
}
