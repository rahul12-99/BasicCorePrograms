package com.basiccoreprogram;

import java.util.Scanner;

public class BasicPrograms {
    /*
     * Method to printing the prime factor of a number
     * @param args
     */

    public static void main(String[] args) {
        /*
         * 1) Taking user input and initialized the variable
         * 2) Taking loop and iterate till n
         * 3) Taking a loop and printing and storing the variable
         * 4) Checking the reminder is greater than 2 and printing
         */
        /*
         1) Taking user input and initialized the variable
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = sc.nextInt();

        /*
         2) Taking loop and iterate till n
         */
        for (int i = 2; i < number; i++) {
            /*
             3) Taking a loop and printing and storing the variable
             */
            while (number % i == 0) {
                System.out.println(i + " ");
                number = number / i;
            }
        }
        /*
          4) Checking the reminder is greater than 2 and printing
         */
        if (number > 2) {
            System.out.println(number);
        }
    }
}
