package com.basiccoreprogram;

import java.util.Scanner;

public class BasicPrograms {
    /*
     * Method to check even odd number
     * @param args
     */
    public static void main(String[] args) {
        /*
         * 1) Taking user input for number
         * 2) checking the condition for even or odd and printing
         */
        /*
         1) 1) Taking user input for number
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        /*
         2) checking the condition for even or odd and printing
         */
        if (number % 2 == 0) {
            System.out.println(number + " is even ");
        } else {
            System.out.println(number + " is odd ");
        }

    }
}
