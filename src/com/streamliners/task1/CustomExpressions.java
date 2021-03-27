package com.streamliners.task1;

import java.util.*;
import java.util.regex.Pattern;

public class CustomExpressions {
    public static String modify(String s, String replacements) {
        char[] array = new char[10];

        for (int i = 0; i < replacements.length(); i += 2) {
            array[replacements.charAt(i)-48] = replacements.charAt(i+1);
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = array[s.charAt(i)-48];
            sb.append(ch);
        }
        return sb.toString();
    }

    public static boolean checkUsingRegExp(String s, String replacements) {
        Set<Character> numericStringSet = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            numericStringSet.add(s.charAt(i));
        }
        ArrayList<Character> numericStringArray = new ArrayList<>(numericStringSet);
        Collections.sort(numericStringArray);

        ArrayList<Character> numericReplacementsArray = new ArrayList<>();
        for (int i = 0; i < replacements.length(); i+=2) {
            numericReplacementsArray.add(replacements.charAt(i));
        }
        Collections.sort(numericReplacementsArray);

        if (!numericReplacementsArray.equals(numericStringArray)) {
            return false;
        }

        for (int i = 1; i < replacements.length(); i += 2) {
            if (Character.isLetter(replacements.charAt(i))) {
                continue;
            }
            return false;
        }

        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the numeric string to be converted: ");
        String str = sc.nextLine();

        System.out.print("Please enter the replacement string: ");
        String replacements = sc.nextLine();

        if(!checkUsingRegExp(str, replacements)) {
            System.out.println("ERROR: The replacement string is not correct.");
            return;
        }

        System.out.println("The replaces string is " + modify(str, replacements.toUpperCase()));
    }
}
