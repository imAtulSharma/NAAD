package com.streamliners.task0.string;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramString {
    public static void main(String[] args) {
        //        initialing scanner to input stream
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first String: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second String: ");
        String str2 = sc.nextLine();

        char[] str1Array = str1.toCharArray();
        char[] str2Array = str2.toCharArray();

        Arrays.sort(str1Array);
        Arrays.sort(str2Array);

        if (Arrays.equals(str1Array, str2Array)) System.out.println("YES, these are anagram of each other.");
        else System.out.println("NO, these are not anagram.");
    }
}
