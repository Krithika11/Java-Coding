package com.learnJava.CollectionsPractice;

import java.util.TreeSet;

public class TreeSetExamples {

    public static void main(String[] args) {
        TreeSet<String> tree = new TreeSet();

        tree.add("Nishant");
        tree.add("Krithika");
        tree.add("Anjana");
        tree.add("Mounica");
        tree.add("Adil");

        System.out.println(tree); // treeset prints or returns sorted set


        TreeSet<Integer> treeSet = new TreeSet();

        treeSet.add(10);
        treeSet.add(12);
        treeSet.add(14);
        treeSet.add(50);
        treeSet.add(100);

        System.out.println(treeSet);
        System.out.println(treeSet.lower(12));
        System.out.println(treeSet.higher(14));


    }
}
