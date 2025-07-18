package com.bridgelabz.collection.linkedlist;

public class DetectNthNodeFromEndOfList<T> {

    public Node<T> removeNthNodeFromEnd(Node<T> head, int n) {
        int count = 0;
        Node<T> current = head;
        // Count total nodes
        while (current != null) {
            count++;
            current = current.next;
        }
        if (n > count)
            return head;
        if (count - n == 0) {
            return head.next;
        }
        Node<T> temp = head;
        for (int i = 1; i < count - n; i++) {
            temp = temp.next;
        }
        if (temp.next != null) {
            temp.next = temp.next.next;
        }
        return head;
    }

    public void printList(Node<T> head) {
        Node<T> current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) System.out.print(" -> ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        DetectNthNodeFromEndOfList<Integer> list = new DetectNthNodeFromEndOfList<>();
        Node<Integer> node1 = new Node<>(1);
        Node<Integer> node2 = new Node<>(2);
        Node<Integer> node3 = new Node<>(3);
        Node<Integer> node4 = new Node<>(4);
        Node<Integer> node5 = new Node<>(5);
        Node<Integer> node6 = new Node<>(6);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        System.out.print("Original List: ");
        list.printList(node1);
        int n = 2;
        Node<Integer> newHead = list.removeNthNodeFromEnd(node1, n);
        System.out.print("List after removing " + n + "th node from end: ");
        list.printList(newHead);
    }
}
