package com.Algos.BinarySearch;

public class CeilOfNum {
    public static void main(String[] args) {
        int[] arr = {2, 3, 5, 9, 14, 16, 18};
        int target = 15;

        System.out.println(ceilOfNum(arr, target)); // 5
    }

    // ceiling of a number
    static int ceilOfNum(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // check if target is greater than arrs last element return -1
        if (target > arr[end]) return -1;

        // iterate over the array
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        // loop over the array and return arr starting element
        return start;
    }
}
