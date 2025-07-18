package com.bridgelabz.collection.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class CycleDetect<T> {
    public Node<T> detectCycle(Node<T> head) {
        Set<Node<T>> visitedNode = new HashSet<>();
        Node<T> current = head;
        while (current != null) {
            if (visitedNode.contains(current)) {
                return current;
            }
            visitedNode.add(current);
            current = current.next;
        }
        return null;
    }

    public static void main(String[] args) {
        // Instantiate the class for Integer type
        CycleDetect<Integer> cycleDetector = new CycleDetect<>();

        Node<Integer> node1 = new Node<>(1);
        Node<Integer> node2 = new Node<>(2);
        Node<Integer> node3 = new Node<>(3);
        Node<Integer> node4 = new Node<>(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        // Create a cycle: n4 -> n2
        node4.next = node2; // You can change this to null to test non-cyclic case
        Node<Integer> res = cycleDetector.detectCycle(node1);
        if (res != null) {
            System.out.println("Yes, cycle present and starts at node with value: " + res.data);
        } else {
            System.out.println("No, cycle not present.");
        }
    }
}
