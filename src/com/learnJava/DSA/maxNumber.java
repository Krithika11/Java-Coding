package com.learnJava.DSA;

public class maxNumber {


        static int getmax(int arr[], int n){
            if(n==1) {
                System.out.println(n);
                return arr[0];
            }
            int result = Math.max(arr[n-1], getmax(arr, n-1));
            System.out.println(result);
            return result;
        }
        public static void main(String args[])
        {
            int arr[] = {34, 13, 1, 10, 12, 10};
            int n = arr.length;
            System.out.print(getmax(arr, n));
        }


    }
