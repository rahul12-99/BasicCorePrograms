package com.basiccoreprogram;

import java.util.Scanner;

public class BasicPrograms {
    /*
     * Method to swap two number
     * @param args
     */
    public static void main(String[] args) {
        /*
         * 1) Taking user input and initialized the variable n1,n2 and also a temporary variable
         * 2) write swapping logic and after swapping printing them
         */
        /*
         1) Taking user input and initialized the variable n1,n2 and also a temporary variable
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int n1 = sc.nextInt();
        System.out.println("Enter second number");
        int n2 = sc.nextInt();
        int temp;
        System.out.println("before swapping the number " + n1 +  " " + n2);
        /*
         2) write swapping logic and after swapping printing them
         */
        temp = n1;
        n1 = n2;
        n2 = temp;
        System.out.println("after swapping the number " + n1 + " " + n2);
    }
}
