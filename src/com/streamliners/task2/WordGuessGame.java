package com.streamliners.task2;

import java.util.Scanner;

public class WordGuessGame {
    public static int toUpper(int asciiValue) {
        if (asciiValue > 96 && asciiValue < 123) {
            return asciiValue-32;
        }
        return asciiValue;
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
    public static void startGame(String s) {
        Scanner sc = new Scanner(System.in);
        char guess;

        String originalString = s;

//        Counting consonants
        int consonantCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (isConsonant(s.charAt(i)))
                consonantCount++;
        }

        int chances = consonantCount + 3;

//        making consonants invisible
        for (int i = 0; i < s.length(); i++) {
            if (isConsonant(s.charAt(i))) {
                s = s.replace(s.charAt(i), '_');
            }
        }

//         Running game loop
        while (chances-- != 0) {
            System.out.println("\nWord: " + s);
            System.out.println("Chances: " + (chances + 1));
            System.out.print("Guess: ");
            guess = sc.next().charAt(0);
            guess = (char) toUpper(guess);

            if (originalString.indexOf(guess) != -1) {
                int characterFoundCount = 0;

//                checking positions of the character
                for (int i = 0; i < originalString.length(); i++) {
                    if(originalString.charAt(i) == guess) {
                        characterFoundCount++;
                        s = s.substring(0,i) + guess + s.substring(i+1);
                    }
                }
                System.out.println("character found " + characterFoundCount + " time(s).");
            }
            else {
                System.out.println("Oh! Character not found.");
            }

//            chekcing that the string is completed
            if (s.equals(originalString)) {
                System.out.println("\nWord: " + s);
                System.out.println("You win the game.");
                return;
            }
        }
        System.out.println("\nYou loose the game.");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to be played in game: ");
        String str = sc.nextLine();

        startGame(str.toUpperCase());
    }
}
