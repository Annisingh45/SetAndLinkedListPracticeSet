package com.bridgelabz.collection.set;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class MaintainingInsertionOrder {
    public static void main(String[] args) {
        List<String> l=new ArrayList<>();
        l.add("Ram");
        l.add("Sita");
        l.add("Shiva");
        l.add("Krishna");
        l.add("Ganesha");
        l.add("Krishna");
        l.add("Ganesha");
        l.add("Shiva");

        System.out.println("Before Adding into set: "+l);
        Set<String> s=performOperation(l);
        System.out.println("After add into set :" +s);



    }

    private static Set<String> performOperation(List<String> l) {
        LinkedHashSet<String> lhs=new LinkedHashSet<>();
        for(String var:l)
        {
            lhs.add(var);
        }
        return lhs;
    }
}
