package com.Algos.BinarySearch;

public class Implementation {
    public static void main(String[] args) {
        int[] arr = {8, 12, 16, 19, 24, 27, 29};
        int target = 24;

        System.out.println(binarySearch(arr, target)); //
    }

    static int binarySearch(int[] arr, int target) {
        // start value of arr
        int start = 0;
        // end value of arr
        int end = arr.length - 1;


        // iterate over the array till start less than equals to end
        while (start <= end) {

        // mid value of arr
        int mid = start + (end - start) / 2;

            /* check if arr target is less than arr-mid value if it is
               than reassign end to mid by less than 1 if not
               then check else if target is greater than arr mid-value if it is
               then reassign start to mid by greater than 1 if not
               then return mid-value
            */
            if (target < arr[mid]) {
                end = mid - 1;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                return mid;
            }
        }

        // iterate over the above loop till target element found if not found return -1
        return -1;
    }
}
