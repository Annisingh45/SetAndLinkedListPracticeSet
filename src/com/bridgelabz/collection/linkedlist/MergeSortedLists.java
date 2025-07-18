package com.bridgelabz.collection.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class MergeSortedLists {
    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        list1.add(60);

        List<Integer> list2 = new LinkedList<>();
        list2.add(90);
        list2.add(100);
        list2.add(170);
        list2.add(200);
        list2.add(550);

        System.out.println("List 1: " + list1);
        System.out.println("List 2: " + list2);

        List<Integer> slist = mergeSortedLists(list1, list2);
        System.out.println("Merged Sorted List: " + slist);
    }


    private static List<Integer> mergeSortedLists(List<Integer> list1, List<Integer> list2) {
        List<Integer> sortedList = new LinkedList<>();
        int i = 0, j = 0;
        while (i < list1.size() && j < list2.size()) {
            if (list1.get(i) <= list2.get(j)) {
                sortedList.add(list1.get(i));
                i++;
            } else {
                sortedList.add(list2.get(j));
                j++;
            }
        }
        // Add remaining elements from list1
        while (i < list1.size()) {
            sortedList.add(list1.get(i));
            i++;
        }
        // Add remaining elements from list2
        while (j < list2.size()) {
            sortedList.add(list2.get(j));
            j++;
        }
        return sortedList;
    }
}