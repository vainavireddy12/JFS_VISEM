package com.example;

/**
 * Hello world!
 *
 */
public class Prime 
{
    public static void main( String[] args )
    {
        int number = 29;
        boolean isPrime = true;

        for (int i = 2; i <= number/2; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(number + " is prime? " + isPrime);
    }
}
