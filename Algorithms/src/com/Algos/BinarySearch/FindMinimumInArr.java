package com.Algos.BinarySearch;

public class FindMinimumInArray {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 1, 2, 3};
        System.out.println(findMinimum(arr)); // 1
    }

    public static int findMinimum(int[] arr) {
        int pivotElement = findPivotElement(arr);
        return arr[pivotElement + 1];
    }

    public static int findPivotElement(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }


            // check if elements at middle, start, end are equal if it is then just skip the duplicates
            if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                // check if these elements at start and end were the pivots or not
                if (start < end && arr[start] > arr[start + 1]) {
                    return start;
                }
                start++;

                if (end > start && arr[end] < arr[end - 1]) {
                    return end - 1;
                }
                end--;
            }
            // now check if left side is sorted, so pivot should be in right
            else if (arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
