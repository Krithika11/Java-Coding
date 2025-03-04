package com.learnJava.codesignal;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetAnangram {

    // Method to return a unique character signature for each string.
    static String sortCharacters(String input) {
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }

    // Method to find unique words from array2 that have an anagram in array1
    public static int findAnagrams(String[] array1, String[] array2) {
        HashSet<String> sortedWordsInArray1 = new HashSet<>();

        // TODO: fill in sortedWordsInArray1
        for(String word : array1) {
            sortedWordsInArray1.add(sortCharacters(word));
        }

        HashSet<String> anagramsMatched = new HashSet<>();
        HashSet<String> uniqueWordsInArray2 = new HashSet<>();

        int lengthSum = 0;

        for (String word : array2) {
            uniqueWordsInArray2.add(word);
        }

        for (String word : uniqueWordsInArray2) {

            if(sortedWordsInArray1.contains(sortCharacters(word))) {

                if(!anagramsMatched.contains(word)) {
                    anagramsMatched.add(word);
                }
            }
        }

        for(String strLength: anagramsMatched) {

            char[] charSum = strLength.toCharArray();
            lengthSum = lengthSum + charSum.length;
        }
        return lengthSum;
    }

    public static void main(String []args){
        String[] array1 = {"cat", "dog", "tac", "god", "act"};
        String[] array2 = {"tca", "ogd", "atc", "taco"};
        int result = findAnagrams(array1, array2);
        System.out.println(result);   // output: 9

        // additional test samples
        String[] array3 = {"rat", "tar", "bat", "tab","bats"};
        String[] array4 = {"tra", "art", "abr"};
        int result2 = findAnagrams(array3, array4);
        System.out.println(result2);  // output: 6
    }
}
