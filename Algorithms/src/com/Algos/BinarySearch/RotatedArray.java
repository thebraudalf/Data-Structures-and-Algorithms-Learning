package com.Algos.BinarySearch;

public class RotatedArray {
    public static void main(String[] args) {
        int[] arr = {2, 9, 2, 2, 2};
        int target = 9;

        System.out.println(findTarget(arr, target)); // 1
    }

    static int findTarget(int[] arr, int target) {

        int pivot = findPivotInDuplicatedArray(arr);

        // check if pivot is found if not then arr is not rotated
        if (pivot == -1) {
            return binarySearch(arr, target, 0, arr.length - 1);
        }

        // check if pivot is found if it is perform binary search
        if (arr[pivot] == target) {
            return pivot;
        }

        if (target >= arr[0]) {
            return binarySearch(arr, target, 0, pivot - 1);
        }

        return binarySearch(arr, target, pivot + 1, arr.length);
    }

    static int findPivotInDuplicatedArray(int[] arr) {
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

    static int binarySearch(int[] arr, int target, int start, int end) {
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

        return -1;
    }
}
