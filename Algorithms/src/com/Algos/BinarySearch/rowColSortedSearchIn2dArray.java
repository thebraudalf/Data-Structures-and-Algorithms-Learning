package com.Algos.BinarySearch;

import java.util.*;

public class rowColSortedSearchIn2dArray {
    public static void main(String[] args) {
        // This array is sorted in rows and columns
        int[][] matrix = {
                {10, 20, 30, 40},
                {15, 25, 35, 45},
                {20, 29, 37, 49},
                {33, 34, 38, 50},
        };
        int target = 37;

        System.out.println(Arrays.toString(search(matrix, target))); // [2, 2]
    }

    static int[] search(int[][] matrix, int target) {
        // row starts from 0
        int row = 0;
        // column starts from array's row's length
        int col = matrix[row].length - 1;

        // iterate over the arr till row less than array's length and column less than equals to 0
        while (row < matrix.length && col >= 0) {
            // if element equals to target then return row and col
            if (matrix[row][col] == target) {
                return new int[]{row, col};
            }

            /* if element is less than target then increment the row
               else element is greater than target then decrement the column */
            if (matrix[row][col] < target) {
                row++;
            } else {
                col--;
            }
        }

        // iterate over the loop if element not found return -1 arr
        return new int[]{-1, -1};
    }
}
