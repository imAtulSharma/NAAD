package com.streamliners.task0.introduction;

import java.util.Scanner;

public class MultiplyFloatingNumbers {
    public static void main(String[] args) {
//        initialing scanner to input stream
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter first floating number: ");
        float a = sc.nextFloat();

        System.out.println("Please enter second floating number: ");
        float b = sc.nextFloat();

//        Printing product of a and b
        System.out.println("The product is  " + a*b);
    }
}
