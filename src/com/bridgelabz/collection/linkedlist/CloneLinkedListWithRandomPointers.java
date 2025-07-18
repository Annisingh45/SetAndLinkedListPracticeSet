package com.bridgelabz.collection.linkedlist;

import java.util.HashMap;

public class CloneLinkedListWithRandomPointers {
    public static class Node {
        int data;
        Node next;
        Node random;

        Node(int data) {
            this.data = data;
            this.next = null;
            this.random = null;
        }
    }

    public static Node cloneList(Node head) {
        if (head == null)
            return null;
        // Map from original node to its clone
        HashMap<Node, Node> map = new HashMap<>();
        Node current = head;
        while (current != null) {
            map.put(current, new Node(current.data));
            current = current.next;
        }

        current = head;
        while (current != null) {
            Node clone = map.get(current);
            clone.next = map.get(current.next);
            clone.random = map.get(current.random);
            current = current.next;
        }
        return map.get(head);
    }

    // Helper to print the list (shows value and random's value)
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            int randomVal = (current.random != null) ? current.random.data : -1;
            System.out.print("[" + current.data + ", random: " + randomVal + "] -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create original list: 7 -> 13 -> 11
        Node node1 = new Node(7);
        Node node2 = new Node(13);
        Node node3 = new Node(11);
        node1.next = node2;
        node2.next = node3;
        node1.random = null;
        node2.random = node1;
        node3.random = node2;

        System.out.println("Original list:");
        printList(node1);

        Node clonedHead = cloneList(node1);

        System.out.println("Cloned list:");
        printList(clonedHead);
    }
}