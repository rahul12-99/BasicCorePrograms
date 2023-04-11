package com.basiccoreprogram;

import java.util.Scanner;

public class BasicPrograms {
    /**
     * Method for flip the coin and count the head and tail occurrence
     * and printing the head and tail occurrence percentage
     *
     * @param args
     */
    public static void main(String[] args) {
        /*
         * 1) taking variable and taking the user input for how many times flip the coin
         * 2) initialize a random variable and check the condition and increase the count
         * 3) getting the head-percentage and tail-percentage and printing
         */

        /*
        1) taking variable and taking the user input for how many times flip the coin
         */
        int headCount = 0, tailCount = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter how many times you flip the coin");
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            /*
             2) initialize a random variable and check the condition and increase the count
             */
            double flipCoin = Math.floor(Math.random() * 2);
            if (flipCoin < 0.5) {
                tailCount++;
            } else {
                headCount++;
            }

        }
        /*
        3) getting the head-percentage and tail-percentage and printing
         */
        double headPercentage = (double) headCount / n * 100;
        double tailPercentage = (double) tailCount / n * 100;
        System.out.println("Head percentage of flip coin is : " + headPercentage + "%");
        System.out.println("Tail percentage of flip coin is : " + tailPercentage + "%");
    }
}
