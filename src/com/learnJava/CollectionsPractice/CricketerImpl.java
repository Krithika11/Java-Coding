package com.learnJava.CollectionsPractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CricketerImpl{

    public static void main(String[] args) {

        List<Cricketer> cricketer = new ArrayList<>();

        cricketer.add(new Cricketer("Sachin", 99));
        cricketer.add(new Cricketer("Dhoni", 90));
        cricketer.add(new Cricketer("Virat", 100));
        cricketer.add(new Cricketer("Rohit", 95));

        System.out.println(cricketer);

//        Collections.sort(cricketer); //cannot implement Collections.sor if the Cricketer class does not implement Comparable
        Collections.sort(cricketer, new DescendingOrder());
        System.out.println(cricketer);

    }
}
