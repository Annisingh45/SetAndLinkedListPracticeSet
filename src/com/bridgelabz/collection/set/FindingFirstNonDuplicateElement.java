package com.bridgelabz.collection.set;

import java.util.*;

public class FindingFirstNonDuplicateElement {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(4);
        list.add(7);
        list.add(8);
        list.add(5);

        Integer firstNonDuplicateValue = findFirstNonDuplicateValue(list);
        System.out.println("FirstNonDuplicateValue is :" + firstNonDuplicateValue);
    }

    //method to find first non duplicate value
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