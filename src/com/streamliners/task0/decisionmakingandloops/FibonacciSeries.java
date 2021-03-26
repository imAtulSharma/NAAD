package com.streamliners.task0.decisionmakingandloops;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        //        initialing scanner to input stream
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the number of fibonacci elements: ");
        int n = sc.nextInt();

        int previous = 0;
        int next = 1;
        int sum;

        System.out.println("The fibonacci series for the first " + n + " terms is following:");
        for (int i = 0; i < n; i++) {
            System.out.print(previous + ", ");
            sum = previous + next;
            previous = next;
            next = sum;
        }
        System.out.println("\b\b");
    }
}
