package com.bridgelabz.collection.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class ReorderList {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println("Original list"+list);
        List<Integer> rl = reOrderList(list);
        System.out.println("Reordered List: " + rl);
    }

    private static List<Integer> reOrderList(List<Integer> list) {
        List<Integer> result = new LinkedList<>();
        int left = 0, right = list.size() - 1;
        while (left < right) {
            result.add(list.get(left));
            result.add(list.get(right));
            left++;
            right--;
        }
        // If odd number of elements, add the middle one
        if (left == right) {
            result.add(list.get(left));
        }
        return result;
    }
}