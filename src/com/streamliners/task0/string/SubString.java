package com.streamliners.task0.string;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter greater string: ");
        String greater = sc.nextLine();

        System.out.print("Enter smaller string: ");
        String smaller = sc.nextLine();

        if(greater.contains(smaller)) System.out.println("YES, the smaller string is substring.");
        else System.out.println("NO, it is not sub string");
    }
}
