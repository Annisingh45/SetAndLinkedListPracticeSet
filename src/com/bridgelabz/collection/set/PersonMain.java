package com.bridgelabz.collection.set;

import java.util.HashSet;
import java.util.Set;

public class PersonMain {
    public static void main(String[] args) {
        CustomObjectSetOperations p1=new CustomObjectSetOperations(22,"Anni");
        CustomObjectSetOperations p2=new CustomObjectSetOperations(22,"Anaya");

        Set<CustomObjectSetOperations> s=new HashSet<>();
        s.add(p1);
        s.add(p2);

        for(CustomObjectSetOperations var:s)
        {
            System.out.println(var);
        }

    }
}
