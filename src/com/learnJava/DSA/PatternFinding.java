package com.learnJava.DSA;

import org.w3c.dom.ls.LSOutput;

import java.util.*;

public class PatternFinding {

    public static void main(String args[]) {
//        pattern1();
//        pattern2();
        sumEqualTo100();
    }

    public static void pattern1(){
        //*****
        //****
        //***
        //**
        //*
        int n =5;
        for(int row =0; row<=n; row++) {
            for(int col=n-row; col>0; col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2() {
        //relationship row=column
        //1
        //12
        //123
        //1234
        //12345
        int n =5;
        for(int row =1; row<=n; row++) {
            for(int col=1; col<=row; col++){
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public static void sumEqualTo100() {
        Map<Integer, Integer> map = new HashMap();
//to find the index of another number in the array that can be added to the current number to make the total sum equal to 100
        Integer[] array = new Integer[]{20,8,31,92,50};
        System.out.println(array);
        List<Integer> list1 = new ArrayList<>();
        List list = Arrays.asList(array);
        for(int i =0; i<array.length; i++) {
            int diff = 100 - array[i];

            if(list.contains(diff) &&(diff != array[i])) {
                map.put(array[i], i);
                list1.add(map.get(array[i]));
            }
        }
        System.out.println(list1);
    }
}
