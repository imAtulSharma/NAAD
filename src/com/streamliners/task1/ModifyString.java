package com.streamliners.task1;

import java.util.Scanner;

public class ModifyString {
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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the numeric string to be converted: ");
        String str = sc.nextLine();

        System.out.print("Please enter the replacement string: ");
        String replacements = sc.nextLine();

        System.out.println("The replaces string is " + modify(str, replacements));
    }
}
