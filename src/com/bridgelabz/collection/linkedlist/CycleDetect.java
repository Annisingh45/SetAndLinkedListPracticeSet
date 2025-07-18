package com.bridgelabz.collection.linkedlist;

import java.util.HashSet;
import java.util.Set;

public class CycleDetect {

    public static class Node {
        int data;
        Node next;

        //Constructor
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node detectCycle(Node head) {
        Set<Node> visitedNode = new HashSet<>();
        Node current = head;
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
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);

        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        //create cycle
        n4.next = null;

        Node res = detectCycle(n1);
        if (res != null) {
            System.out.println("Yes cycle present ,and cycle starts at node with value: " + res.data);
        } else {
            System.out.println("No,cycle does not present:");
        }

    }

}
