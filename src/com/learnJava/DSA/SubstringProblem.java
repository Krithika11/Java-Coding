package com.learnJava.DSA;

public class SubstringProblem {

    public static boolean hasCharacter(String str) {
        int n = str.length();
        String subString = str.substring(1,n-1);
        System.out.println("" + subString);
        String firstCharacter = str.substring(0,1);
        System.out.println(firstCharacter);

        String lastCharacter = str.substring(n-1,n);
        System.out.println(lastCharacter);

        return subString.contains(firstCharacter) || subString.contains(lastCharacter);
    }

    public static void main(String[] args) {
        String input = "chemical";

        boolean result = hasCharacter(input);
        if(result) {
            System.out.println("Yes, it has");
        }
        else
            System.out.println("No, it doesn't have");
    }
}
