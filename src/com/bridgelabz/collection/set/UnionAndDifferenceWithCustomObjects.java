package com.bridgelabz.collection.set;

import java.util.Set;
import java.util.TreeSet;

public class UnionAndDifferenceWithCustomObjects {
    public static void main(String[] args) {
        Person person1 = new Person(22, "Anni");
        Person person2 = new Person(18, "Khushi");
        Person person3 = new Person(16, "Nitish");
        Person person4 = new Person(10, "Bob");
        Person person5 = new Person(23, "Lisa");
        Person person6 = new Person(11, "John");

        Set<Person> setA = new TreeSet<>();
        setA.add(person1);
        setA.add(person2);
        setA.add(person3);

        Set<Person> setB = new TreeSet<>();
        setB.add(person4);
        setB.add(person5);
        setB.add(person6);

        Set<Person> union = getUnion(setA, setB);
        System.out.println(union);
    }

    private static Set<Person> getUnion(Set<Person> setA, Set<Person> setB) {
        Set<Person> unionSet = new TreeSet<>(setA);
        unionSet.addAll(setB);
        return unionSet;
    }
}
