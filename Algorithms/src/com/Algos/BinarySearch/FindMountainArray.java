package com.Algos.BinarySearch;

public class FindMountainArray {
    public static void main(String[] args) {
        int[] arr = {12, 13, 14, 15, 11, 10};
        int target = 6;

        System.out.println(findMountainArray(arr, target)); // 4
    }

    static int findMountainArray(int[] arr, int target) {
        int peakElement = findPeakElement(arr);

        int firstAttempt = bsInAnyOrder(arr, target, 0, peakElement);

        // check if our ans is -1 or not if not then return ans
        // or check for target in non-decreasing order of arr
        if (firstAttempt != -1) {
            return firstAttempt;
        }

        // if in first attempt we get -1 then return with second attempt
        // or check for target in decreasing order of arr
        return bsInAnyOrder(arr, target, peakElement + 1, arr.length - 1);
    }

    static int findPeakElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }

    static int bsInAnyOrder(int[] arr, int target, int start, int end) {
        // check if array is in ascending order
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return -1;
    }
}
