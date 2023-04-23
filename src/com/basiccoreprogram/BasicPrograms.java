package com.basiccoreprogram;

import java.util.Scanner;

public class BasicPrograms {
    /*
     * Method to check largest number among three number
     * @param args
     */
    public static void main(String[] args) {
        /*
         * 1) Taking user input for n1,n2,n3
         * 2) check the condition n1 is greater and printing
         * 3) check the condition n2 is greater and printing
         * 4) condition for n3 is greater and printing
         */
        /*
         1) Taking user input for n1,n2,n3
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int n1 = sc.nextInt();
        System.out.println("Enter second number");
        int n2 = sc.nextInt();
        System.out.println("Enter third number");
        int n3 = sc.nextInt();
        /*
         2) check the condition n1 is greater and printing
         */
        if(n1 > n2 && n1 > n3){
            System.out.println(n1 + " is greater");
            /*
             3) check the condition n2 is greater and printing
             */
        } else if (n2 > n1 && n2 > n3) {
            System.out.println(n2 + " is greater");
            /*
             4) condition for n3 is greater and printing
             */
        } else {
            System.out.println(n3 + " is greater");
        }
    }
}
