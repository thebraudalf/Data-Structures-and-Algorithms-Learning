package com.Algos.LinearSearch;

public class Implementation {
    public static void main(String[] args) {
        int[] arr = {12, 34, 54, 43, 67};
        int target = 34;

        System.out.println(linearSearch(arr, target)); // 2
    }

    static int linearSearch(int[] arr, int target) {
        // check if arr is empty or not if it is return -1
        if(arr.length == 0){ return -1;}
        // iterate over the array
        for (int i = 0; i < arr.length; i++) {
            // and check if arr element is equals to target element
            if (arr[i] == target) {
                return i;
            }
        }
        // execute above loop if element is found if target element is not found then return -1
        return -1;
    }

}
