package com.Algos.BinarySearch;

public class SmallestLetter {
    public static void main(String[]args){
        char[] arr = {'c', 'd', 'e', 'f'};
        char target = 'j';

        System.out.println(smallestLetter(arr, target)); // c
    }

    static char smallestLetter(char[] arr, char target){
        int start = 0;
        int end = arr.length - 1;

        while (start <= end){
            int mid = start + (end - start) / 2;

            if (target < arr[mid]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return arr[start % arr.length];
    }
}
