package com.bridgelabz.collection.set;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class SortedUniqueElements {
    public static void main(String[] args) {
        List<Integer> l=new LinkedList<>();
        l.add(7);
        l.add(2);
        l.add(9);
        l.add(1);
        l.add(2);
        l.add(9);

        Set<Integer> s=new TreeSet<>();
        for (int var:l)
        {
            s.add(var);
        }
        System.out.println("Normal list:"+l);
        System.out.println("Sorted and unique list :"+s);
    }
}
