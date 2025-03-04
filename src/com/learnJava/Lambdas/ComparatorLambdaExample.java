package com.learnJava.Lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {
    public static void main(String[] args) {

        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2); // 0 if o1==o2
                                            // -1 if o1<o2
                                            // 1 if o1>o2
            }
        };
        System.out.println("Result of Comparator is:" + comparator.compare(1,2));
        // lambda method
        Comparator<Integer> Lambdacomparator = (Integer a, Integer b) -> a.compareTo(b);
                System.out.println("Result of LambdaComparator:" + Lambdacomparator.compare(3,2));

            // without specifying the datatype in the lambda input
                Comparator<Integer> lambdaComparator1 = (a,b) -> a.compareTo(b);
                System.out.println("Lambda REsult:" + lambdaComparator1.compare(2,2));
    }
}
