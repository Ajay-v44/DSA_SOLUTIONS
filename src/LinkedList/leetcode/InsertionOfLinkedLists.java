package LinkedList.leetcode;

import java.util.HashSet;

public class InsertionOfLinkedLists {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<ListNode>();
        while(headA!=null){
            set.add(headA);
            headA=headA.next;
        }
        while(headB!=null){
            if(set.contains(headB)){
                return headB;
            }
            headB=headB.next;
        }
        return  null;
    }

    static void main() {

    }
}
