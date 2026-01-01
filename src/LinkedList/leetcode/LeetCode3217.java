package LinkedList.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCode3217 {
    public static ListNode modifiedList(int[] nums, ListNode head){
        ListNode currHead=head;
        if(nums.length>0){
            Map<Integer,Integer> map=new HashMap<>();
            for (int item:nums)
                map.put(item,map.getOrDefault(item,0)+1);

            ListNode prev=head;
            while (head!=null){
                if(map.containsKey(head.val)){
                    if (currHead.equals(head)){
                        currHead=head.next;
                    }else {
                        prev.next=head.next;
                    }
                }else {
                    prev=head;
                }
                head=head.next;
            }
        }
        return currHead;
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
        ListNode l1=new ListNode(1);
        ListNode l2=new ListNode(2);
        l1.next=l2;
        ListNode l3=new ListNode(3);
        ListNode l4=new ListNode(4);
        l2.next=l3;
        l3.next=l4;
        int[] arr={1,2,5,6};
        displayLinkedList(modifiedList(arr,l1));

    }
}
