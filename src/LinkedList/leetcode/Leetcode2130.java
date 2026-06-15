package LinkedList.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode2130 {
    public static int pairSum(ListNode head) {
        int max = 0;
        List<Integer> lst=new ArrayList<>();
        while (head!=null){
            lst.add(head.val);
            head=head.next;
        }
        int n=lst.size();
        for (int i = 0; i < n; i++) {
            if( i<= ((n / 2) - 1)){
                max=Math.max(max,(lst.get(i)+ lst.get(n-1-i)));
            }
        }
        return max;
    }

    static void main() {
        ListNode l1=new ListNode(5);
        ListNode l2=new ListNode(4);
        l1.next=l2;
        ListNode l3=new ListNode(2);
        ListNode l4=new ListNode(1);
        l2.next=l3;
        l3.next=l4;
        System.out.println(pairSum(l1));


    }
}
