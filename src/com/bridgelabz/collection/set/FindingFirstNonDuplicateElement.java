package com.bridgelabz.collection.set;

import java.util.*;

public class FindingFirstNonDuplicateElement {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<>();
        l.add(4);
        l.add(5);
        l.add(6);
        l.add(4);
        l.add(7);
        l.add(8);
        l.add(5);

        Integer n = findFirstNonDuplicateValue(l);
        System.out.println("FirstNonDuplicateValue is :" + n);
    }

    private static Integer findFirstNonDuplicateValue(List<Integer> l) {
        Set<Integer> unique = new LinkedHashSet<>();
        Set<Integer> duplicate = new HashSet<>();
        for (Integer num : l) {
            if (duplicate.contains(num)) {
                continue;
            }
            if (unique.contains(num)) {
                unique.remove(num);
                duplicate.add(num);
            } else {
                unique.add(num);
            }
        }
        for (Integer num : unique)
            return num;

        return null;
    }
}