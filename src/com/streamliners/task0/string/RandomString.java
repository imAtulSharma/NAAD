package com.streamliners.task0.string;

import java.util.Random;
import java.util.Scanner;

public class RandomString {
    public static String getRandomString(int size)
    {

        // Choose a character from this String randomly
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";

        // create StringBuffer
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < size; i++) {
            /**
             * Math.random function
             * @return random floating number from 0 to 1(excluded)
             */
            int index = (int)(source.length() * Math.random());

            // append character to sb
            sb.append(source.charAt(index));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the length of the random string: ");
        int n = sc.nextInt();

        System.out.println("The randomly generated string is \"" + getRandomString(n) + "\"");
    }
}
