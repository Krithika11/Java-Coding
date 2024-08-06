package com.learnJava.DSA;

import java.util.ArrayList;
import java.util.List;

public class findWitnesses {

    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>( List.of(3,6,3,4,1));
        findWitnesses(list1);
    }

    public static void findWitnesses(List<Integer> nums1) {
//        List<Integer> result  = nums1.stream().filter(i -> i>i+1).collect(Collectors.toList());
        List<Integer> list = new ArrayList<>();
        int i = 0;
        int j = nums1.size() - 1;
        while (i < j) {
            if (nums1.get(i) > nums1.get(i + 1)) {
                list.add(nums1.get(i));
                i++;
            }

            else if (nums1.get(i) < nums1.get(i + 1)) {
            i++;
        }
    }
        list.add(nums1.get(j)); // to get the last element
        System.out.println("The output is:" + list);

    }

}

