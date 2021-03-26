package com.streamliners.task0.introduction;

import java.util.Scanner;

public class GreatestFromThree {
    public static void main(String[] args) {
//        initialing scanner to input stream
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first integer(A): ");
        int a = sc.nextInt();

        System.out.println("Please enter second integer(B): ");
        int b = sc.nextInt();

        System.out.println("Please enter third integer(C): ");
        int c = sc.nextInt();

        String result;

//        Checking result
        if (a > b) {
            result = (a > c) ? "A is greatest" : "C is greatest";
        } else if (b > c) {
            result = "B is greatest";
        } else {
            result = "C is greatest";
        }

//      Printing result
        System.out.println(result);
    }
}
