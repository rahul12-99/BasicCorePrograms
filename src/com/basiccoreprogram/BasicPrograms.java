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
        System.out.println("Please enter an alphabet to check");
        char c = sc.next().charAt(0);
        if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' || c == 'i' ||
                c == 'o' || c == 'u') {
            System.out.println(c + " is vowel ");
        } else {
            System.out.println(c + " is consonant");
        }
    }
}
