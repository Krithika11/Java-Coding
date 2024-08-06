package com.learnJava.codesignal;

public class advanceBinarySearch {
        public static int findPosition(int arr[], int x) {
            // TODO: find peak

            int peak = findPeak(arr);
            // TODO: search to the left of the peak
            int ascending = binarySearch(arr, x, 0, arr.length -1, true);
            // TODO: search to the right of the peak
            int decending = binarySearch(arr, x, peak+1, arr.length -1, false);
            if(ascending == -1) {
                return decending;
            }
            else return ascending;


        }

        static int findPeak(int arr[]) {
            int low = 0, high = arr.length - 1, mid=0;
            while(low <= high) {
                mid = low +(high-low)/2;
                if(arr[mid] > arr[mid+1]) {
                    high = mid;
                }
                else low = mid+1;
            }
            return mid;
        }

        static int binarySearch(int arr[], int x, int low, int high, boolean ascending) {
            while (low <= high) {
                int mid = low + (high - low) / 2;
                if (arr[mid] == x) {
                    return mid;
                } else if (ascending) {
                    if (arr[mid] < x) {
                        low = mid + 1;
                    } else {
                        high = mid - 1;
                    }
                } else {
                    // TODO: implement the descending binary search logic
                    while(low<=high) {

                        mid = low + (high-low)/2;
                        if(arr[mid] == x) {
                            return mid;
                        }

                        else if(arr[mid] < x) {
                            high = mid;
                        }
                        else low = mid + 1;

                    }
                }
            }
            return -1;
        }

        public static void main(String[] args) {
            int arr[] = {-3, -2, 4, 6, 10, 8, 7, 1};
            int x = 7;
            int position = findPosition(arr, x);
            if (position == -1) {
                System.out.println("Element Not Present");
            } else {
                System.out.println("Element Present at Index " + position);
            }
        }
    }

