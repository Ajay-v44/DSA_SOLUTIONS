package LinkedList.Circular;

import LinkedList.Double.Position;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        CicularLkstOps obj=new CicularLkstOps();
        obj.insertNode(10, Position.Head, java.util.Optional.empty());
        obj.insertNode(15, Position.Head, java.util.Optional.empty());
        obj.insertNode(20, Position.Head, java.util.Optional.empty());

        obj.printLinkedList();
    }
}
