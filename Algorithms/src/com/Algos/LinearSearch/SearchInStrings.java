package com.Algos.LinearSearch;

public class SearchInStrings {
    public static void main(String[] args) {
        String str = "User";
        char target = 'r';

        System.out.println(linearSearch(str, target)); // 3
    }

    static int linearSearch(String str, char target) {
        // check if string is empty or not if it is then return -1
        if (str.length() == 0) {
            return -1;
        }

        // iterate over the str
        for (int i = 0; i < str.length(); i++) {
            // and check if target element is equals to str character at ith position
            if (target == str.charAt(i)) {
                return i;
            }
        }

        // execute above iteration if target element is not found then return -1
        return -1;
    }
}
