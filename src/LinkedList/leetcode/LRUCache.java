package LinkedList.leetcode;

import java.util.HashMap;

public class LRUCache {
    int capacity;
    HashMap<Integer, DoubleLinkedList> map = new HashMap<>();

    static class DoubleLinkedList {
        int key;
        int val;
        DoubleLinkedList next;
        DoubleLinkedList prev;

        public DoubleLinkedList(int key, int val) {
            this.key = key;
            this.val = val;
            this.next = null;
            this.prev = null;
        }
    }

    // head will be the MRU sentinel
    DoubleLinkedList head = new DoubleLinkedList(-1, -1);
    // tail will be the LRU sentinel
    DoubleLinkedList tail = new DoubleLinkedList(-1, -1);

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }

    // Removes a node from its current position
    public void remove(DoubleLinkedList node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    // Inserts a node right after the head sentinel (MRU position)
    public void insert(DoubleLinkedList node) {
        node.next = head.next;
        node.prev = head;

        head.next.prev = node;
        head.next = node;
    }

    public int get(int key) {
        if (map.containsKey(key)) {
            DoubleLinkedList node = map.get(key);
            remove(node);
            insert(node);
            return node.val;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (map.containsKey(key)) {
            remove(map.get(key));
        }

        DoubleLinkedList newNode = new DoubleLinkedList(key, value);
        map.put(key, newNode);
        insert(newNode);

        if (map.size() > capacity) {
            // The LRU node is the one right before the tail sentinel
            DoubleLinkedList lru = tail.prev;
            remove(lru);
            map.remove(lru.key);
        }
    }
}
