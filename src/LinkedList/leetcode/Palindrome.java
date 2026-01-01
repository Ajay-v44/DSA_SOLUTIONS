package LinkedList.leetcode;

public class Palindrome {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null)
            return true;
        ListNode fastP = head;
        ListNode slowP = head;
        while (fastP != null && fastP.next != null) {
            fastP = fastP.next.next;
            slowP = slowP.next;
        }
        if(slowP.next==null){
            return head.val==slowP.val;
        }
        ListNode next;
        ListNode current = slowP.next;
        ListNode prev = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        while (head != null && prev != null) {
            if (head.val != prev.val)
                return false;
            head = head.next;
            prev = prev.next;
        }
        return true;
    }
}