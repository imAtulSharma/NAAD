package com.streamliners.task0.decisionmakingandloops;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        //        initialing scanner to input stream
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a integer: ");
        int number = sc.nextInt();
        int count = 0;

//        To count the digits
        while (number > 0) {
            count++;
            number/=10;
        }
        System.out.println("The integer has " + count + " digits.");
    }
}
