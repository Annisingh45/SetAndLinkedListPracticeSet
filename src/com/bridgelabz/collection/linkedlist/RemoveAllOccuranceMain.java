package com.bridgelabz.collection.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class RemoveAllOccuranceMain {
    public static void main(String[] args) {
        List<Integer> list=new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(10);
        list.add(30);
        list.add(50);
        list.add(90);
        list.add(10);
        list.add(20);
        System.out.println(list);
        List<Integer> ul=removeAllOccuranceOf(list,20);
        System.out.println(ul);
    }

    private static List<Integer> removeAllOccuranceOf(List<Integer> l, int i) {
        List<Integer> nl=new LinkedList<>();
        for(int var:l)
        {
            if(var!=i)
            {
                nl.add(var);
            }
        }
        return nl;
    }
}
