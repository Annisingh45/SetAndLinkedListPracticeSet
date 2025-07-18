package com.bridgelabz.collection;

import java.util.Stack;

public class ImplementingQueueUsingStack {
    private Stack<Integer> inStack = new Stack<>();
    private Stack<Integer> outStack = new Stack<>();

    public void enqueue(int n) {
        inStack.push(n);
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
            return -1; // Sentinel value for empty queue
        }
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
        return outStack.pop();
    }

    // Peek front element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot peek.");
            return -1; // Sentinel value for empty queue
        }
        if (outStack.isEmpty()) {
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
        return outStack.peek();
    }

    public boolean isEmpty() {
        return inStack.isEmpty() && outStack.isEmpty();
    }

    public static void main(String[] args) {
        ImplementingQueueUsingStack queue = new ImplementingQueueUsingStack();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Peek: " + queue.peek());
        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Is queue empty: " + queue.isEmpty());

        // Test empty queue behavior
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue(); // Now queue is empty
        System.out.println("Dequeued: " + queue.dequeue()); // Should print message
        System.out.println("Peek: " + queue.peek()); // Should print message
    }
}