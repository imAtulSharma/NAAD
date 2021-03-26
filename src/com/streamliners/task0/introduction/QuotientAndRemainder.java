package com.streamliners.task0.introduction;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
//        initialing scanner to input stream
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter dividend: ");
        int dividend = sc.nextInt();

        System.out.println("Please enter divisor: ");
        int divisor = sc.nextInt();

        int quotient = dividend/divisor;
        int remainder = dividend-quotient*divisor;

//        Printing quotient and remainder
        System.out.println("Quotient is " + quotient + " and remainder is " + remainder);
    }
}
