package com.streamliners.task0.typeconversion;

import java.util.Scanner;

public class IntegerToString {
    public static void main(String[] args) {
//        initialing scanner to input stream
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a number: ");
        int number = sc.nextInt();

        StringBuilder result = new StringBuilder();

        while (number > 0) {
            int remainder = number%10;
            number /= 10;
            char ch = (char)(remainder+48);
            result.append(ch);
        }
        result.reverse();
        System.out.println("The converted string is " + result);
    }
}
