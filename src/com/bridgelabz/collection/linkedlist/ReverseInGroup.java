package com.bridgelabz.collection.linkedlist;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ReverseInGroup {
    public static void main(String[] args) {
        List<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        System.out.println("Original"+list);
        List<Integer> rl=reverseTheList(list,3);
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
