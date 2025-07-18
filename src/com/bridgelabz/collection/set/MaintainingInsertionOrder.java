package com.bridgelabz.collection.set;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MaintainingInsertionOrder {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Ram");
        list.add("Sita");
        list.add("Shiva");
        list.add("Krishna");
        list.add("Ganesha");
        list.add("Krishna");
        list.add("Ganesha");
        list.add("Shiva");

        System.out.println("Before Adding into set: " + list);
        Set<String> s = performOperation(list);
        System.out.println("After add into set :" + s);
    }

    private static Set<String> performOperation(List<String> l) {
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        for (String var : l) {
            linkedHashSet.add(var);
        }
        return linkedHashSet;
    }
}
