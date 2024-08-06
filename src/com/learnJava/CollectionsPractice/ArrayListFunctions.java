package com.learnJava.CollectionsPractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListFunctions {
    public static void main(String[] args) {
        List<Integer> integer = new ArrayList<>();
        integer.add(5);  //     5 is autoboxed into Integer object and store in ArrayList.
        integer.add(10);
        integer.add(20);

        List<String> string = new ArrayList<>();
        System.out.println(string.add("Ananthanarayanan")); // Element is added at the end of list
        string.add(0, "Krithika");
//        string.remove(1);

        System.out.println(string.size());
        System.out.println(string.contains("Krithika"));
//        string.get(1);
        System.out.println(string);

        int[] newArray = new int[5]; // Array Declaration

        Iterator<Integer> iterator = integer.listIterator();
        while(iterator.hasNext()) {
            Integer result = iterator.next();
            System.out.println(result);
        }
    }
}
