package com.Algos.BinarySearch;

public class SplitArrSum {
    public static void main(String[]args){
        int[] arr = {7, 2, 5, 10, 8};

        System.out.println(splitArray(arr, 2)); // 18
    }
    public static int splitArray(int[] nums, int k) {
        int start = 0;
        int end = 0;

        // loop to get max item in an arr
        for (int i = 0; i < nums.length; i++) {
            start = Math.max(start, nums[i]);
            end += nums[i];
        }

        // performing binary search
        while (start < end) {
            int mid = start + (end - start) / 2;

            int sum = 0;
            int splits = 1;

            // loop to find how many split or pieces you can divide with max sum
            for (int num : nums) {
                // check if sum add of num arr greater than mid element
                // if it over sum equals to mid and split the arr
                // if it's not then add arr item in sum
                if (sum + num > mid) {
                    sum = num;
                    splits++;
                } else {
                    sum += num;
                }
            }

            // if splits greater than k start = mid + 1
            if (splits > k) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }

        return end;
    }
}
