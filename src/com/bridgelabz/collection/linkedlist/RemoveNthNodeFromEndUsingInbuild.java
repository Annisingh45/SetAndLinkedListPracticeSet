package com.bridgelabz.collection.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class RemoveNthNodeFromEndUsingInbuild {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        System.out.println(list);
        list.remove(3);
        System.out.println(list);
    }
}
