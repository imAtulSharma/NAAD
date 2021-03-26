package com.streamliners.task0.decisionmakingandloops;

import java.util.Scanner;

public class CheckAlphabet {
    public static void main(String[] args) {
        //        initialing scanner to input stream
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a character: ");
        char ch = sc.next().charAt(0);
        String result = "It is NOT a character.";

        //        Make sure that the character is character from A - Z or from a - z
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

        result = "It is a character";
        System.out.println(result);
    }
}
