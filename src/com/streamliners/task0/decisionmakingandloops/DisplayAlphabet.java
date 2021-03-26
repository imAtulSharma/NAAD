package com.streamliners.task0.decisionmakingandloops;

public class DisplayAlphabet {
    public static void main(String[] args) {
        for (int i = 0; i < 26; i++) {
            System.out.print((char) (i+65) + " ");
        }
        System.out.println("\b");
    }
}
