package com.learnJava.DSA;

// To find the least number of days required to watch all movies with a total duration of 3 hours,
// where each movie has a runtime of 1.01 hours, we can follow a simple approach:

import java.util.Arrays;

public class LeastDaystoWatch {

    public static void main(String[] args) {

        double[] duration = new double[]{1.01, 1.4, 1.01, 1.01, 1.4};
        int result = minDurationMovies(duration);
        System.out.println(result);

    }

    public static int minDurationMovies(double[] duration) {

        int result = 0;
        //you can watch a maximum of two movies
        Arrays.sort(duration);

        //use two pointers at the beginning and end of the array
        int i = 0;
        int j= duration.length-1;
//1.01, 1.01, 1.01, 1.4, 1.4
     //   result = 3

        while(i<j && !(duration == null)) {
            if(duration[i] + duration[j] <= 3) {
                i++; j--;
                result++;
            }
            else {
                j--;
                result++;
            }
        }
        if(i==j) {
            result ++;
            System.out.println(i);
            System.out.println(j);
        }

        return result;

    }
}
