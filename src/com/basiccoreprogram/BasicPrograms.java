package com.basiccoreprogram;

import java.util.Scanner;

public class BasicPrograms {
    /*
     * Method to printing the quotient and remainder
     * @param args
     */

    public static void main(String[] args) {
        /*
         * 1) Taking user input for Dividend and divisor
         * 2) get the quotient and remainder
         * 3) printing the quotient and remainder
         */
        /*
         1) Taking user input for Dividend and divisor
         */
        System.out.println("Enter Dividend and divisor:");
        Scanner Sc = new Scanner(System.in);
        int dividend = Sc.nextInt();
        int divisor = Sc.nextInt();
        /*
          2) get the quotient and remainder
         */
        double quotient = dividend / divisor;
        double remainder = dividend % divisor;
        /*
         3) printing the quotient and remainder
         */
        System.out.println("The Quotient is: " + quotient);
        System.out.println("The Remainder is: " + remainder);
    }
}
