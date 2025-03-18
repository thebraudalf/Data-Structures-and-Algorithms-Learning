package com.Algos.BinarySearch;

import java.util.Arrays;

public class FirstAndLastPosition {
    public static void main(String[] args) {
        int[] nums = {};
        int target = 0;

        System.out.println(Arrays.toString(searchRange(nums, target))); // [3, 4]
    }

    static int[] searchRange(int[] nums, int target) {

        int[] ans = {-1, -1};
        ans[0] = search(nums, target, true);
        // check if first occurrence if target first
        if (ans[0] != -1) {
            ans[1] = search(nums, target, false);
        }

        if (nums.length == 0) {
            return new int[]{-1, -1};
        } else {
            return ans;
        }
    }

    static int search(int[] nums, int target, boolean findStartIndex) {

        int start = 0;
        int end = nums.length;
        // if ans equals to -1
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                ans = mid;
                // check if to find start index
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ans;
    }
}
