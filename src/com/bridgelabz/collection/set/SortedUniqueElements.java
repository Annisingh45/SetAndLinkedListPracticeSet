package com.bridgelabz.collection.set;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortedUniqueElements {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(7);
        list.add(2);
        list.add(9);
        list.add(1);
        list.add(2);
        list.add(9);

        Set<Integer> set = new TreeSet<>();
        for (int var : list) {
            set.add(var);
        }
        System.out.println("Normal list:" + list);
        System.out.println("Sorted and unique list :" + set);
    }
}
