package com.streamliners.task0.arrays;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
//        initialing scanner to input stream
        Scanner sc = new Scanner(System.in);

        System.out.print("How many number you want to get average of: ");
        int n = sc.nextInt();

        int sum = 0;

        int[] numbers = new int[n];
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter the value of array at " + i+1 + " position");

//            Taking input for the number array
            numbers[i] = sc.nextInt();

//            adding the input value simultaneously
            sum += numbers[i];
        }

        float average = (float) sum/n;

//        Printing the average of the array
        System.out.println("The average of the array is " + average);
    }
}
