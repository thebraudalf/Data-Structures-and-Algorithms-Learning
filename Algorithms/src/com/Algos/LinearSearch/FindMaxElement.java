package com.Algos.LinearSearch;

public class FindMaxElement {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 43, 21, 24},
                {92, 12, 27, 26},
                {32, 78, 99},
        };
        System.out.println(linearSearch(arr));
    }

    static int linearSearch(int[][] arr) {
        // var of maximum value
        int maxVal = Integer.MIN_VALUE;
        // iterate over the row of array
        for (int row = 0; row < arr.length; row++) {
            // iterate over the column of row of the array
            for (int col = 0; col < arr[row].length; col++) {
                // check if all array elements are greater than minimum value
                if (arr[row][col] > maxVal) {
                    // if it is then reassign the greatest element to maxVal
                    maxVal = arr[row][col];
                }
            }
        }

        // execute above iteration and return the maximum value
        return maxVal;
    }
}
