package com.Algos.LinearSearch;

// LC Question: https://leetcode.com/problems/richest-customer-wealth/description/
public class RichestWealth {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 2, 3},
                {3, 2, 1}
        };

        System.out.println(richestWealth(accounts)); // 6
    }

    static int richestWealth(int[][] accounts){
        int maxWealth = Integer.MIN_VALUE;

        for (int person = 0; person < accounts.length; person++) {

            // when you start a new row, take a new sum for that row
            int sum = 0;
            for (int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account];
            }

            // if that sum is greater than maximum wealth then assign that sum to maximum wealth
            if (sum > maxWealth) {
                maxWealth = sum;
            }
        }

        return maxWealth;
    }
}
