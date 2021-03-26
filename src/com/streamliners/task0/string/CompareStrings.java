package com.streamliners.task0.string;

import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        //        initialing scanner to input stream
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first String: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second String: ");
        String str2 = sc.nextLine();

        if(str1.equals(str2)) System.out.println("Both strings are equal.");
        else System.out.println("These are NOT equal.");
    }
}
