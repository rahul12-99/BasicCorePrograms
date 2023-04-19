package com.basiccoreprogram;

import java.util.Scanner;

public class BasicPrograms {
    /*
     * Method to printing the nth harmonic value
     * @param args
     */

    public static void main(String[] args) {
        /*
         * 1) Get user input and initialized the variable
         * 2) Taking a loop till n and adding in nthHarmonic variable
         * 3) Printing the nthHarmonic value
         */
        /*
         1) Get user input and initialized the variable
         */
        double nthHarmonic = 0;
        System.out.println("Enter a number");
        Scanner Sc = new Scanner(System.in);
        int N = Sc.nextInt();
        /*
         2) Taking a loop till n and adding in nthHarmonic variable
         */
        for (int i = 1; i <= N; i++){
            nthHarmonic += (float)1/i;
        }
        /*
          3) Printing the nthHarmonic value
         */
        System.out.println("Nth Harmonic Value is: " + nthHarmonic);
    }
}
