package com.bridgelabz.collection.set;

import java.util.Set;
import java.util.TreeSet;
import java.util.Iterator;

public class RemoveElementsBasedOnCondition {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();
        set.add(11);
        set.add(4);
        set.add(10);
        set.add(25);
        set.add(2);
        set.add(1);

        System.out.println(set);
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            int i = iterator.next();
            if (i < 10) {
                iterator.remove();
            }
        }
        System.out.println(set);
    }
}