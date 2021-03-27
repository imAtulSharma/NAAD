package com.streamliners.task1;

import java.util.Scanner;

public class TotalWeight {
    public static int toUpper(int asciiValue) {
        if (asciiValue > 96 && asciiValue < 123) {
            return asciiValue-32;
        }
        return asciiValue;
    }
    public static int totalWeight(String s, int[] weights) {
        int weight = 0;

        for (int i = 0; i < s.length(); i++) {
            weight += weights[toUpper(s.charAt(i))-65];
        }

        return weight;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the string to find weight: ");
        String str = sc.nextLine();

        System.out.print("Please enter the weights from A to E: ");

        int[] weights = new int[5];
        for (int i = 0; i < weights.length; i++) {
            weights[i] = sc.nextInt();
        }

        System.out.println("The weight of the string is " + totalWeight(str, weights));
    }
}
