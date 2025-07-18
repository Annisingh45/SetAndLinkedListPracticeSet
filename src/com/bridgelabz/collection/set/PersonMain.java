package com.bridgelabz.collection.set;

import java.util.HashSet;
import java.util.Set;

public class PersonMain {
    public static void main(String[] args) {
        CustomObjectSetOperations person1 = new CustomObjectSetOperations(22, "Anni");
        CustomObjectSetOperations person2 = new CustomObjectSetOperations(22, "Anaya");

        Set<CustomObjectSetOperations> s = new HashSet<>();
        s.add(person1);
        s.add(person2);

        for (CustomObjectSetOperations var : s) {
            System.out.println(var);
        }
    }
}
