package com.streamliners.task0.introduction;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
//        initialing scanner to input stream
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number to check: ");
        int number = sc.nextInt();

//        check that the number is whole number (means integer from 0 to infinity)
        if (number < 0) {
            System.out.println("ERROR! The number entered is negative (It should be a whole number)");
            return;
        }

//        Check whether the number is ODD or EVEN
        String result = number % 2 == 0 ? "The number is EVEN" : "The number is ODD";
        System.out.println(result);
    }
}
