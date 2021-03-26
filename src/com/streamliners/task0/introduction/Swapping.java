package com.streamliners.task0.introduction;

import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
//        initialing scanner to input stream
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first number: ");
        int first = sc.nextInt();

        System.out.println("Please enter second number: ");
        int second = sc.nextInt();

//        Printing both number before swapping
        System.out.println("Before swapping the numbers are:");
        System.out.println("fisrt = " + first + " and second = " + second);

        int temp;
        temp = first;
        first = second;
        second = temp;

//        Printing both number after swapping
        System.out.println("After swapping the numbers are:");
        System.out.println("first = " + first + " and second = " + second);
    }
}
