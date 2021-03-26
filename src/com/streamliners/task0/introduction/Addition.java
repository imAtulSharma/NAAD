package com.streamliners.task0.introduction;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
//        initialing scanner to input stream
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first integer: ");
        int a = sc.nextInt();

        System.out.println("Please enter second integer: ");
        int b = sc.nextInt();

//        Printing sum of a and b
        System.out.println("The sum is  " + (a+b));
    }
}
