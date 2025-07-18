package com.bridgelabz.collection.set;

import java.util.*;

public class ClassSpecificSetBehavior {
    public static void main(String[] args) {
        List<Integer> l = new LinkedList<>();
        l.add(5);
        l.add(3);
        l.add(5);
        l.add(1);
        l.add(2);


        System.out.println("Normal list: " + l);
        Set<Integer> res = setImple(l);
        System.out.println("HashSet: " + res);
        Set<Integer> result = setImp(l);
        System.out.println("LinkedHashSet: " + result);
        Set<Integer> result1= setIm(l);
        System.out.println("TreeSet : "+result1);


    }

    private static Set<Integer> setIm(List<Integer> l) {
        TreeSet<Integer> ts=new TreeSet<>();
        for(int var:l)
        {
            ts.add(var);
        }
        return ts;
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
