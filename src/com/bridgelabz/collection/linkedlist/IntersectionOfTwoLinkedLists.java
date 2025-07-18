package com.bridgelabz.collection.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class IntersectionOfTwoLinkedLists {
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
        list2.add(80);
        list2.add(70);
        list2.add(100);
        list2.add(50);
        list2.add(60);

        List<Integer> uniqueList = new LinkedList<>(list1);
        uniqueList.retainAll(list2);
        System.out.println(uniqueList);
    }
}
