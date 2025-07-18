package com.bridgelabz.collection.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class PalindromeCheck {
    public static void main(String[] args) {
        List<Integer> list1 = new LinkedList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(30);
        list1.add(20);
        list1.add(10);
        System.out.println(list1);
        List<Integer> list2 = list1.reversed();
        System.out.println(list2);

        boolean res = isPalindrome(list1);
        if (res) {
            System.out.println("Yes, it is palindrome");
        } else {
            System.out.println("no,it is not palindrome");
        }
    }

    private static boolean isPalindrome(List<Integer> list1) {
        if (list1.equals(list1.reversed())) {
            return true;
        }
        return false;
    }
}
