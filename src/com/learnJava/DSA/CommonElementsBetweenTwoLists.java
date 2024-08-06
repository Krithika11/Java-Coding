package com.learnJava.DSA;

import java.util.*;
import java.util.stream.Collectors;

public class CommonElementsBetweenTwoLists {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>(Arrays.asList(1,2,2,3,3,4));
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,5,5,3,3,4));
//            list1.retainAll(list2);
//            System.out.println(list1);

        Set<Integer> set1 = new HashSet<>(list1);
        System.out.println(set1);
        Set<Integer> result = list2.stream().filter(set1 :: contains).collect(Collectors.toSet());
        System.out.println(result);
    }

}
