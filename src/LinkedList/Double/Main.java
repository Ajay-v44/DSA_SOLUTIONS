package LinkedList.Double;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        DoubleLinkedList obj=new DoubleLinkedList();
        obj.insertNode(5,Position.Head, java.util.Optional.empty());
        obj.insertNode(10,Position.Head, java.util.Optional.empty());
        obj.insertNode(15,Position.Head, java.util.Optional.empty());
        obj.insertNode(41,Position.Tail,java.util.Optional.empty());
        obj.insertNode(42,Position.Tail,java.util.Optional.empty());
        obj.insertNode(43,Position.Tail,java.util.Optional.empty());
        obj.printNodes(Position.Head);
        obj.insertNode(20,Position.Head, Optional.of(2));
        obj.printNodes(Position.Head);
        obj.deleteNode(Position.Head,java.util.Optional.empty());
        obj.deleteNode(Position.Head,java.util.Optional.empty());
        obj.deleteNode(Position.Tail,java.util.Optional.empty());
        obj.deleteNode(Position.Head,Optional.of(2));
        obj.printNodes(Position.Head);
        obj.printNodes(Position.Tail);
    }
}
