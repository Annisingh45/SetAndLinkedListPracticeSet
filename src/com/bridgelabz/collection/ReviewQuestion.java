package com.bridgelabz.collection;

import java.util.*;

public class ReviewQuestion {
    public static void main(String[] args) {
        Map<String, List<Integer>> map=new HashMap<>();
        map.put("A",Arrays.asList(1,2,3));
        map.put("B",Arrays.asList(4,5));
        map.put("C",Arrays.asList(6,7,8,9));

        List<Integer> l=new ArrayList<>();
        Set<Map.Entry<String,List<Integer>>> entry=map.entrySet();
        for(Map.Entry<String,List<Integer>> var:entry)
        {
            l.addAll(var.getValue());
        }
        System.out.println(l);

    }
}
