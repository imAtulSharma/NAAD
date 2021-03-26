package com.streamliners.task0.introduction;

import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        //        initialing scanner to input stream
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a character: ");
        char ch = sc.next().charAt(0);

        String result = "ERROR: Please enter a character from A - Z or a - z";

//        make sure that the character is character from A - Z or from a - z
        int asciiValue = (int) ch;
        if (asciiValue < 65){
            System.out.println(result);
            return;
        } else if (asciiValue > 122) {
            System.out.println(result);
            return;
        } else if (asciiValue > 90 && asciiValue < 97) {
            System.out.println(result);
            return;
        }

//        checking status of the character
        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U' -> result = "The character is Vowel";
            default -> result = "The character is consonant";
        }
        System.out.println(result);
    }
}
