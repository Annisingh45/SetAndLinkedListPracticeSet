package com.bridgelabz.collection.set;

import java.util.*;

public class ClassSpecificSetBehavior {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(3);
        list.add(5);
        list.add(1);
        list.add(2);

        System.out.println("Normal list: " + list);
        Set<Integer> res = setImple(list);
        System.out.println("HashSet: " + res);
        Set<Integer> result = setImp(list);
        System.out.println("LinkedHashSet: " + result);
        Set<Integer> result1= setIm(list);
        System.out.println("TreeSet : "+result1);
    }

    private static Set<Integer> setIm(List<Integer> l) {
        TreeSet<Integer> treeSet=new TreeSet<>();
        for(int var:l)
        {
            treeSet.add(var);
        }
        return treeSet;
    }

    private static Set<Integer> setImp(List<Integer> l) {
        LinkedHashSet<Integer> list=new LinkedHashSet<>();
        for(int var:l)
        {
            list.add(var);
        }
        return list;
    }

    private static Set<Integer> setImple(List<Integer> l){
        Set<Integer> hashSet=new HashSet<>();
        for(Integer var:l)
        {
            hashSet.add(var);
        }
        return hashSet;
    }
}
