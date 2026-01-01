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
        ListNode obj5 = new ListNode(5);
        ListNode obj6 = new ListNode(6);
        obj2.next = obj5;
        obj5.next = obj6;
//        obj4.next = obj2;
//        CycleInLinkeList lst = new CycleInLinkeList();
//        System.out.println(lst.hasCycleOpt(obj));
        Palindrome objP=new Palindrome();
        System.out.println(objP.isPalindrome(obj));

    }
}
