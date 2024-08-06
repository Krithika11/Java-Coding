package com.learnJava.DSA;
//Write a program to check if a string has all 9 digits

public class DigitsInString {

    static boolean isDigit(char ch) {
        if(ch >= '0' && ch <= '9') {
            return true;
        }
        return false;
    }

    static boolean hasDigits(String string, int len) {
        int maxValue = 10;
        int count = 0;

        boolean[] positive = new boolean[maxValue];
        for(int i=0; i<len; i++) {

            if(isDigit(string.charAt(i))) {
                int num = string.charAt(i) - '0';
                positive[num] = true;
            }
        }

        for(int i=0; i<maxValue; i++) {
            if(!positive[i]) {
                return false;
            }

        }
            return true;
    }

    public static void main(String[] args) {
        String str = "Geeks1234567809ForGeeks";

        int len = str.length();

        if(hasDigits(str, len)) {
            System.out.println("Has all 9 digits");
        }
        else
        System.out.println("Not have all 9 digits");
    }
}
