package LinkedList.Circular;

import LinkedList.Double.Position;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        CicularLkstOps obj = new CicularLkstOps();
        obj.insertNode(10, Position.Head, java.util.Optional.empty());
        obj.insertNode(15, Position.Head, java.util.Optional.empty());
        obj.insertNode(20, Position.Head, java.util.Optional.empty());
        obj.insertNode(3, Position.Tail, java.util.Optional.empty());
        obj.insertNode(13, Position.Tail, java.util.Optional.empty());
        obj.insertNode(600, Position.Tail, Optional.of(3));
        obj.printLinkedList();
        obj.deleteNode(Position.Head, Optional.of(3));
        obj.printLinkedList();
        obj.searchNode(13);
        System.out.println(obj.returnTheMedian());
    }
}
