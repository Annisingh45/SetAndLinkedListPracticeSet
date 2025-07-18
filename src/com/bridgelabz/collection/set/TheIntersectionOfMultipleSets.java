package com.bridgelabz.collection.set;

import java.util.HashSet;
import java.util.Set;

public class TheIntersectionOfMultipleSets {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        Set<Integer> set3 = new HashSet<>();
        set3.add(4);
        set3.add(3);
        set3.add(8);

        Set<Integer> common = intersectionSet(set1, set2, set3);
        System.out.println(common);
    }

    //Using retainAll method
    private static Set<Integer> intersectionSet(Set<Integer> set1, Set<Integer> set2, Set<Integer> set3) {
        Set<Integer> res = new HashSet<>(set1); // Start with set1
        res.retainAll(set2); // Keep only elements also in set2
        res.retainAll(set3); // Keep only elements also in set3
        return res;

    }
}

