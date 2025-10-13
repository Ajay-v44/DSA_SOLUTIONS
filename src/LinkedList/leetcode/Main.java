package LinkedList.leetcode;

public class Main {
    public static void main(String[] args) {
        ListNode obj = new ListNode(2);
        ListNode obj2 = new ListNode(2);
        obj.next = obj2;
        ListNode obj3 = new ListNode(2);
        ListNode obj4 = new ListNode(2);
        obj2.next = obj3;
        obj3.next = obj4;
        obj4.next = obj2;
        CycleInLinkeList lst = new CycleInLinkeList();
        System.out.println(lst.hasCycleOpt(obj));

    }
}
