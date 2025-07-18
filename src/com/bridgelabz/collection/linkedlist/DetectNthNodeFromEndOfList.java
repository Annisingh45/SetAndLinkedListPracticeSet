package com.bridgelabz.collection.linkedlist;

public class DetectNthNodeFromEndOfList {
    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node removeNthNodeFromEnd(Node head, int n) {
        int count = 0;
        Node current = head;
        // Count the number of nodes
        while (current != null) {
            count++;
            current = current.next;
        }
        // If n is greater than the length of the list
        if (n > count) {
            return head;
        }
        // If we need to remove the head node
        if (count - n == 0) {
            return head.next;
        }
        // Traverse to the (count-n-1)th node
        Node temp = head;
        for (int i = 1; i < count - n; i++) {
            temp = temp.next;
        }
        // Remove the nth node from end
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
        return head;
    }

    // Helper method to print the linked list
    public static void printList(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) System.out.print(" -> ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        Node node6 = new Node(6);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        System.out.print("Original List: ");
        printList(node1);
        int n = 2;
        Node newHead = removeNthNodeFromEnd(node1, n);
        System.out.print("List after removing " + n + "th node from end: ");
        printList(newHead);
    }
}