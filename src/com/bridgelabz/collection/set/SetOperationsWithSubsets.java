package com.bridgelabz.collection.set;

import java.util.HashSet;
import java.util.Set;

public class SetOperationsWithSubsets {
    public static void main(String[] args) {
        Set<Integer> setA=new HashSet<>();
        setA.add(1);
        setA.add(2);
        setA.add(3);
        setA.add(4);


        Set<Integer> setB=new HashSet<>();
        setB.add(10);
        setB.add(20);
        setB.add(30);

        boolean res=isSubSet(setA,setB);
        if(res)
            System.out.println("Yes,it is subset");
        else
            System.out.println("No,it is not subset");

    }

    private static boolean isSubSet(Set<Integer> setA, Set<Integer> setB) {
        int count=0;
        for(int i:setA)
        {
            for (int j:setB)
            {
                if(i==j)
                    count++;


            }
        }
        if(count>0)
            return true;
        else
            return false;
    }
}
