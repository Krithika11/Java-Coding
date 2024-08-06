package com.learnJava.DSA;

public class CharacterCount {

    public static void main(String[] args) {
        String x = "Hello World";
        int count = 0;

        for(int i =0; i<x.length(); i++) {
            if(x.charAt(i) !=  ' ') {
                count++;
            }
        }
        System.out.println(count);

    }
}
