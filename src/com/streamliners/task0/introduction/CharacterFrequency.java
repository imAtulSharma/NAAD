package com.streamliners.task0.introduction;

import java.util.Scanner;

public class CharacterFrequency {
    public static int toUpper(int asciiValue) {
        if (asciiValue > 96 && asciiValue < 123) {
            return asciiValue-32;
        }
        return asciiValue;
    }

    public static void main(String[] args) {
        //        initialing scanner to input stream
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a string: ");
        String str = sc.nextLine();

        int[] array = new int[26];

        int i = 0;
        for (;i < str.length(); i++) {
            int index = toUpper(str.charAt(i))-65;
            if (index != -33) {
                array[index]++;
            }
        }
        for (i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                System.out.println((char) (i+65) + " : " + array[i]);
            }
        }
    }
}
