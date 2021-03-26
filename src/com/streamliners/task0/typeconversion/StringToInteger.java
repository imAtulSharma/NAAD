package com.streamliners.task0.typeconversion;

import java.util.Scanner;

public class StringToInteger {
    public static void main(String[] args) {
//        initialing scanner to input stream
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a numberic string: ");
        String str = sc.nextLine();

        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            result = result*10 + str.charAt(i)-48;
        }

        System.out.println("The converted number is " + result);
    }
}
