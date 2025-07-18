package com.bridgelabz.collection.set;

import java.util.Objects;

public class CustomObjectSetOperations {
    int age;
    String name;

    public CustomObjectSetOperations(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(obj instanceof CustomObjectSetOperations)
        {
            CustomObjectSetOperations p=(CustomObjectSetOperations)obj;
            return this.age==p.age;

        }
        return false;


    }



    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    @Override
    public String toString()
    {
        return "Name: "+name+ " Age :"+age;
    }
}
