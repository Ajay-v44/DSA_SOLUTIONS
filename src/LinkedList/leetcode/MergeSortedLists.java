package LinkedList.leetcode;

public class MergeSortedLists {
    private void addNode(ListNode head, ListNode lst) {
        if (head == null) {
            head = lst;
        }
        ListNode temp = head;
        while (temp != null) {
            temp = temp.next;
        }
        temp.next = lst;
    }

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head = null;
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        if (list1 != null || list2 != null) {
            while (temp1 != null && temp2 != null) {
                if (temp1 != null && temp2 != null) {
                    if (temp1.val == temp2.val) {
                        ListNode lst = new ListNode(temp1.val);

                        addNode(head, lst);

                    } else if (temp1.val < temp2.val) {
                        ListNode lst = new ListNode(temp1.val);
                        addNode(head, lst);

                        temp1 = temp1.next;
                    } else {
                        ListNode lst = new ListNode(temp2.val);
                        addNode(head, lst);

                        temp2 = temp2.next;
                    }
                } else if (temp1 == null) {
                    ListNode lst = new ListNode(temp1.val);

                    addNode(head, lst);

                    temp2 = temp2.next;
                } else {
                    ListNode lst = new ListNode(temp1.val);

                    addNode(head, lst);

                    temp1 = temp1.next;
                }
            }
        }


        return head;
    }
}
