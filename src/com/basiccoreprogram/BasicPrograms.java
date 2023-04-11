package com.basiccoreprogram;

import java.util.Scanner;

public class BasicPrograms {
    /**
     * Method for checking the leap-year and printing.
     * @param args
     */

    public static void main(String[] args) {
        /*
         *  Taking the user input and checking the condition
         *    and printing the year is leap-year or not.
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year!");
        int year = sc.nextInt();
        if((year % 4 == 0) && (year % 100 != 0)){
            System.out.println(year + " is a leap-year");
        }else {
            System.out.println(year + " is not a leap-year");
        }
    }
}
