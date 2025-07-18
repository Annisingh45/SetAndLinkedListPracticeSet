package com.bridgelabz.collection.linkedlist;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ReverseInGroup {
    public static void main(String[] args) {
        List<Integer> l=new LinkedList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(40);
        l.add(50);
        l.add(60);

        System.out.println("Original"+l);
        List<Integer> rl=reverseTheList(l,3);
        System.out.println("Updated list"+rl);
    }

    private static List<Integer> reverseTheList(List<Integer> l, int k) {
        int n = l.size();
        for (int i = 0; i < n; i = i + k) {
            int end = Math.min(i + k, n);
            Collections.reverse(l.subList(i, end));
        }
        return l;
    }
}
