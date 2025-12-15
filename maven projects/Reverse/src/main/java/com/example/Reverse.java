package com.example;

/**
 * Hello world!
 *
 */
public class Reverse {
    public static void main(String[] args) {

        int number = 12345;   // change this to any number you want to reverse
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;      // extract last digit
            reversed = reversed * 10 + digit; // add digit to reversed number
            number = number / 10;         // remove last digit from original
        }

        System.out.println("Reversed Number: " + reversed);
    }
}
