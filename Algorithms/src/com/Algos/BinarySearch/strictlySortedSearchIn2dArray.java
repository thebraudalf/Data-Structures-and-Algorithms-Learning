package com.Algos.BinarySearch;

import java.util.*;

public class strictlySortedSearchIn2dArray {
    public static void main(String[] args) {
        // This array is strictly sorted in rows as well as columns
        int[][] arr = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int target = 2;

        System.out.println(Arrays.toString(searchIn2DArray(arr, target))); // [0, 1]
    }

    // simple binary search for array
    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }

            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return -1;
    }

    // binary search for strictly sorted 2d array
    // Here we short the array in 1 row
    static int[] searchIn2DArray(int[][] arr, int target) {
        int rStart = 0;
        int rEnd = arr.length - 1;
        int rCols = arr[0].length;

        while (rStart < rEnd) {
            int mid = rStart + (rEnd - rStart) / 2;

            if (arr[mid][rCols - 1] < target) {
                rStart = mid + 1;
            } else if (arr[mid][rCols - 1] > target) {
                rEnd = mid;
            } else {
                return new int[]{mid, rCols - 1};
            }
        }

        int index = binarySearch(arr[rStart], target);
        if (index != -1) {
            return new int[]{rStart, index};
        } else {
            return new int[]{-1, -1};
        }
    }
}
