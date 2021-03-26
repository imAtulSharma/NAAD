package com.streamliners.task0.decisionmakingandloops;

import java.util.Scanner;

public class VowelsConsonantCount {
    public static boolean isVowel(char ch) {
        /**
         * @return 1 for vowel
         * @return 0 for any other character
         */
        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U': return true;
            default: return false;
        }
    }
    public static boolean isConsonant(char ch) {
        /**
         * @return 1 for consonant
         * @return 0 for any other character
         */
        switch (ch) {
            case 'b', 'c', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z', 'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z': return true;
            default: return false;
        }
    }
    public static void main(String[] args) {
        //        initialing scanner to input stream
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a string: ");
        String str = sc.nextLine();

        int vowels = 0;
        int consonant = 0;

        for (int i = 0; i < str.length();  i++) {
            if (isVowel(str.charAt(i))) vowels++;
            else if (isConsonant(str.charAt(i))) consonant++;
        }
        System.out.println("In the entered string number of vowels is " + vowels + " and number of consonant is " + consonant);
    }
}
