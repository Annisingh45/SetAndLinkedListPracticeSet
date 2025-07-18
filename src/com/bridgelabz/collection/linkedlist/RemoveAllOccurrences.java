package com.bridgelabz.collection.linkedlist;

import java.util.ArrayList;
import java.util.List;

public class RemoveAllOccurrences {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(40);
        list.add(40);
        System.out.println(list);
        System.out.println(list.remove(40));
        System.out.println(list);
    }
}
