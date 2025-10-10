package LinkedList.Single;

public class SingleLinkedList {
    public static void main(String[] args) {
//        head
        Node obj=new Node(4);
//        Next node
        Node obj2=new Node(6);
        obj.next=obj2;
//        This Should give 6
        System.out.println(obj.next.data);
    }
}
