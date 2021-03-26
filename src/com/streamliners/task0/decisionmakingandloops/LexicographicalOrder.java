package com.streamliners.task0.decisionmakingandloops;

import java.util.Scanner;

public class LexicographicalOrder {
    public static void main(String[] args) {
//        initialing scanner to input stream
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the number of elements: ");
        int n = sc.nextInt();
        String[] words = new String[n];
        System.out.println(words.length);

        System.out.println("Now enter all the elements separately:");
        /**
         * Because the input stream takes the previous enter
         */
        sc.nextLine();

        for (int i = 0; i < words.length; i++) {
            words[i] = sc.nextLine();
        }

        System.out.println("Before arranging the array is like: ");
        for (int i = 0; i < words.length; i++) {
            System.out.print("\"" + words[i] + "\" ");
        }

        for (int i = 0; i < words.length; i++) {
            for (int j = i+1; j < words.length; j++) {
                if (words[i].compareTo(words[j]) > 0) {
                    String temp;
                    temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }

        System.out.println("After arranging the array is like: ");
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
    }
}
