package com.streamliners.task0.introduction;

import java.util.Scanner;

public class RemoveSpaces {
    public static StringBuilder removeWhiteSpaces(String str) {
//        initialize builder String with input string
        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == ' ') {
//                delete the whitespace from the specific index
                sb.delete(i, i+1);
            }
        }
        return sb;
    }
    public static void main(String[] args) {
//        initialing scanner to input stream
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a string: ");
        String str = sc.nextLine();

//        Printing the modified string
        System.out.println("The string after removing whitespaces is \"" + removeWhiteSpaces(str).toString() + "\"");
    }
}
