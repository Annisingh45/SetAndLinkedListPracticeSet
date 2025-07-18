package com.bridgelabz.collection.linkedlist;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class CycleDetectUsingInBuild {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);


        System.out.println(list);

        // Check for duplicates
        boolean hasDuplicates = hasDuplicates(list);
        if (hasDuplicates) {
            System.out.println("CycleDetected");
        } else {
            System.out.println("Cycle not detected");
        }
    }

    // Method to check for duplicates in a list
    public static boolean hasDuplicates(List<Integer> l) {
        Set<Integer> visitedNode = new HashSet<>();
        for (Integer i : l) {
            if (visitedNode.contains(i)) {
                return true;
            }
            visitedNode.add(i);
        }
        return false;
    }
}