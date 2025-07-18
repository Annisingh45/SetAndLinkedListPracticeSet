package com.bridgelabz.collection.linkedlist;

import java.util.HashMap;

public class CloneLinkedListWithRandomPointers<T> {

    public Node<T> cloneList(Node<T> head) {
        if (head == null)
            return null;
        HashMap<Node<T>, Node<T>> map = new HashMap<>();
        Node<T> current = head;
        while (current != null) {
            map.put(current, new Node<>(current.data));
            current = current.next;
        }
        current = head;
        while (current != null) {
            Node<T> clone = map.get(current);
            clone.next = map.get(current.next);
            clone.random = map.get(current.random);
            current = current.next;
        }
        return map.get(head);
    }

    public void printList(Node<T> head) {
        Node<T> current = head;
        while (current != null) {
            String randomVal = (current.random != null) ? String.valueOf(current.random.data) : "null";
            System.out.print("[" + current.data + ", random: " + randomVal + "] -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        CloneLinkedListWithRandomPointers<Integer> list = new CloneLinkedListWithRandomPointers<>();

        Node<Integer> node1 = new Node<>(7);
        Node<Integer> node2 = new Node<>(13);
        Node<Integer> node3 = new Node<>(11);
        node1.next = node2;
        node2.next = node3;
        node1.random = null;
        node2.random = node1;
        node3.random = node2;
        System.out.println("Original list:");
        list.printList(node1);
        Node<Integer> clonedHead = list.cloneList(node1);
        System.out.println("Cloned list:");
        list.printList(clonedHead);
    }
}
