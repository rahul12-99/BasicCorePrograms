package com.basiccoreprogram;

import java.util.Scanner;

public class BasicPrograms {
    /*
     * Method for getting the power of table of two.
     * @param args
     */

    public static void main(String[] args) {
        /**
         * 1) Get user input for n in the range of 0 to 31
         * 2) Taking and initialized variable i , power of 2
         * 3) Putting the condition and printing
         * 4) Multiplying with two and increasing the ith term
         */
        //  1) Get user input for n in the range of 0 to 31
        System.out.println("Enter a Number In the range of: 0 <= Number < 31");
        Scanner Sc = new Scanner(System.in);
        // 2) Taking and initialized variable i , power of 2
        int n = Sc.nextInt();
        int i = 0;
        int power_of_two = 1;
        //  3) Putting the condition and printing
        while (i <= n){
            System.out.println(i + " " + power_of_two);
            //  4) Multiplying with two and increasing the ith term
            power_of_two = 2 * power_of_two;
            i++;
        }
    }
}
