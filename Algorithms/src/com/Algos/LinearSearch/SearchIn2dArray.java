package com.Algos.LinearSearch;

import java.util.Arrays;

public class SearchIn2dArray {
    public static void main(String[]args){
        int[][] arr = {
                {23, 43, 21, 24},
                {92, 12, 27, 26},
                {32, 78, 99},
        };

        int target = 92;

        System.out.println(Arrays.toString(linearSearch(arr, target))); // [1, 0]
    }

    static int[] linearSearch(int[][] arr, int target){
        // iterate over the row of array
        for(int row=0; row < arr.length; row++){
            // iterate over the column of row of the array
            for(int col=0; col < arr[row].length; col++){
                // check if arr element is equals to target if it is return new array of row and col
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }

        // execute above iteration if target element not found return new array with -1
        return new int[]{-1, -1};
    }

}
