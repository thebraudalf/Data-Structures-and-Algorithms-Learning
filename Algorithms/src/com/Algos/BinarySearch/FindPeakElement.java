package com.Algos.BinarySearch;

public class FindPeakElement {
    public static void main(String[]args){
        int[] arr = {12, 13, 14, 15, 11, 10};

        System.out.println(findPeakElement(arr)); // 3
    }

    static int findPeakElement(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(start < end){
            int mid = start + (end - start) / 2;

            // check if mid-element is greater than mid + 1 element if it is reassigned end to mid
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        // return start or end after iterate over the array
        return start;
    }
}
