package com.bridgelabz.collection.set;

import java.util.Set;
import java.util.TreeSet;

public class UnionAndDifferenceWithCustomObjects {
    public static void main(String[] args) {
        Person p1=new Person(22,"Anni");
        Person p2=new Person(18,"Khushi");
        Person p3=new Person(16,"Nitish");
        Person p4=new Person(10,"Bob");
        Person p5=new Person(23,"Lisa");
        Person p6=new Person(11,"John");

        Set<Person> setA=new TreeSet<>();
        setA.add(p1);
        setA.add(p2);
        setA.add(p3);

        Set<Person> setB=new TreeSet<>();
        setB.add(p4);
        setB.add(p5);
        setB.add(p6);

        Set<Person> union=getUnion(setA,setB);
        System.out.println(union);




    }

    private static Set<Person> getUnion(Set<Person> setA, Set<Person> setB) {
        Set<Person> unionSet = new TreeSet<>();
        for (Person p1 : setA) {
            unionSet.add(p1);
        }
        for (Person p2 : setB) {
            unionSet.add(p2);
        }
        return unionSet;
    }
}
// using predefined method
/*
private static Set<Person> getUnion(Set<Person> setA, Set<Person> setB) {
    Set<Person> unionSet = new TreeSet<>(setA);
    unionSet.addAll(setB);
    return unionSet;
}*/
