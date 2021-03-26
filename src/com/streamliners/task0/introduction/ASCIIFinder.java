package com.streamliners.task0.introduction;

import java.util.Scanner;

public class ASCIIFinder {
    public static void main(String[] args) {
//        initialing scanner to input stream
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter a character: ");
        char ch = sc.next().charAt(0);

//        Printing ASCII value of the character by converting character into its integer value
        System.out.println("The ASCII value of " + ch + " is " + (int) ch);
    }
}
