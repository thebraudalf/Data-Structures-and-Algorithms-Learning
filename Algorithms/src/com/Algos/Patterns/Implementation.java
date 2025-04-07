package com.Algos.Patterns;

public class Implementation {
    public static void main(String[]args){
        pattern1(5); /*
                           *
                           * *
                           * * *
                           * * * *
                           * * * * *
                      */

        pattern2(5); /*
                           * * * *
                           * * * *
                           * * * *
                           * * * *
                           * * * *
                       */

        pattern3(5); /*
                           * * * * *
                           * * * *
                           * * *
                           * *
                           *
                       */

        pattern4(5); /*
                            1
                            1 2
                            1 2 3
                            1 2 3 4
                            1 2 3 4 5
                        */

        pattern5(5); /*
                            *
                            * *
                            * * *
                            * * * *
                            * * * * *
                            * * * *
                            * * *
                            * *
                            *
                        */



    }
    public static void pattern1(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pattern2(int n){
        for (int row = 0; row < n; row++) {
            for (int col = 1; col < n; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

//    public static void pattern3(int n){
//        for (int row = n; row > 0; --row) {
//            for (int col = row; col > 0; --col) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        System.out.println();
//    }

    public static void pattern3(int n){
        for (int row = 0; row < n; row++) {
            // iterate till the column less than num sub row add 1
            for (int col = 1; col < n - row + 1; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pattern4(int n){
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void pattern5(int n){
        for (int row = 0; row < n * 2; row++) {
            // To find total columns in a row
            // check if row is greater than num if it is multiply n by 2 sub row else row
            int totalColsInRow = row > n ? 2 * n - row: row;
            for (int col = 0; col < totalColsInRow; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

}