package com.Algos.LinearSearch;

// LC Question: https://leetcode.com/problems/find-numbers-with-even-number-of-digits/description/
public class EvenNumberOfDigits {
    public static void main(String[] args) {
        int[] nums = {12,345,2,6,7896};
        System.out.println(findNumbers(nums)); // 2
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for(int num : nums) {
            if (isEvenDigit(num)) {
                count++;
            }
        }
        return count;
    }

    // function to check whether a number contains even digits or not
    static boolean isEvenDigit(int num) {
        int numberOfDigits = digits(num);
        return numberOfDigits % 2 == 0;
    }


    // count number of digits in a number
    static int digits(int num) {

        if (num < 0) {
            num = num * -1;
        }

        if (num == 0) {
            return 1;
        }

        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10; // num /= 10
        }

        return count;
    }

}
