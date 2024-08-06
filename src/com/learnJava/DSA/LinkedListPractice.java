package com.learnJava.DSA;

public class LinkedListPractice {

    public static void main(String[] args) {


        //remove duplicate elements from the list

        StringBuffer sb = new StringBuffer("Hello World");

        sb.replace(1, 3, "eyya");
        System.out.println(sb);

        sb.delete(1,3);
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

        System.out.println(sb.capacity());

        System.out.println(sb.charAt(5));

    }
}
