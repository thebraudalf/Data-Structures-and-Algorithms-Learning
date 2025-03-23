package com.Algos.BinarySearch;

import java.util.ArrayList;

public class SingleElementInArr {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 5, 5};

        System.out.println(findSingleElement(arr)); // 4
    }

    static int findSingleElement(int[] arr) {
        int n = arr.length;
        // check if n equals to 1
        if (n == 1) return arr[0];

        if (arr[0] != arr[1]) return arr[0];

        if (arr[n - 1] != arr[n - 2]) return arr[n - 1];

        int start = 1;
        int end = n - 2;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            // check if mid is single element
            if (arr[mid] != arr[mid - 1] && arr[mid] != arr[mid + 1]) {
                return mid;
            }

            // check if element is in left half
            if ((mid % 2 == 1 && arr[mid] == arr[mid - 1]) || (mid % 2 == 0 && arr[mid] == arr[mid + 1])) {
                start = mid + 1;
            } else {
                // check if element is in right half
                end = mid - 1;
            }
        }

        return -1;
    }
}
