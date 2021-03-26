package com.streamliners.task0.introduction;

import java.util.Scanner;

public class RoundToDecimalPlaces {
    public static void main(String[] args) {
//        initialing scanner to input stream
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        double number = sc.nextDouble();

        System.out.print("Enter the number to which the number is to be round of: ");
        int n = sc.nextInt();

//        Rounding off the number upto n decimal places
        double result = Math.round(number*Math.pow(10, n))/Math.pow(10, n);

        System.out.println("The round off number is " + result);
    }
}
