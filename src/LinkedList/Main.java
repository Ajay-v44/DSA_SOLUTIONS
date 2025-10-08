package LinkedList;

public class Main {
    public static void main(String[] args) {
        LikedListOps obj=new LikedListOps();
        obj.insertAtBeginning(5);
        obj.insertAtBeginning(10);
        obj.insertAtEnd(50);
        obj.insertAtParticularPosition(510,0);
        obj.searchNode(51);
        obj.printLinkedList();
        obj.deleteNode(0);
        obj.deleteNode(2);
        obj.printLinkedList();
    }
}
