package com.bridgelabz.collection.linkedlist;

public class Node<T> {
    public T data;
    public Node<T> next;
    public Node<T> random; // can be null in normal list

    public Node(T data) {
        this.data = data;
        this.next = null;
        this.random = null;
    }
}
