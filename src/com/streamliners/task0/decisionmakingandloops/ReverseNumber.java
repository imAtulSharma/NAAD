package com.streamliners.task0.decisionmakingandloops;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        //        initialing scanner to input stream
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a integer: ");
        int number = sc.nextInt();
        int reverse = 0;

        while (number > 0) {
            int remainder = number%10;
            reverse = reverse*10 + remainder;
            number/=10;
        }
        System.out.println("The reversed number is " + reverse);
    }
}
