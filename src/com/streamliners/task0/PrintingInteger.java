package com.streamliners.task0;

import java.util.Scanner;

public class PrintingInteger {
    public static void main(String[] args) {
        System.out.println("Please enter an integer: ");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        System.out.println("You Entered " + a);
    }
}
