package com.streamliners.task0.decisionmakingandloops;

import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {
        //        initialing scanner to input stream
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a integer: ");
        int number = sc.nextInt();
        int original = number;
        int reverse = 0;

//        To reverse the number
        while (number > 0) {
            int remainder = number%10;
            reverse = reverse*10 + remainder;
            number /= 10;
        }

        if(original == reverse) System.out.println("YES, it is palindrome number.");
        else System.out.println("NO, it is not a palindrome number.");
    }
}
