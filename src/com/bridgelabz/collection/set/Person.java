package com.bridgelabz.collection.set;

public class Person implements Comparable<Person> {
    int age;
    String name;

    public Person(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person: " + "Name is: " + name + " And age is : " + age;
    }

    @Override
    public int compareTo(Person o) {
        return this.age - o.age;
    }
}
