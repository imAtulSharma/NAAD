package com.streamliners.task0.string;

import java.util.Scanner;

public class NumericString {
    public static boolean check(char ch) {
        return (int) ch > 47 && (int) ch < 58;
    }
    public static void main(String[] args) {
        //        initialing scanner to input stream
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a String: ");
        String str = sc.nextLine();

        int flag = 1;

        for (int i = 0; i < str.length(); i++) {
            if (!check(str.charAt(i))) {
                flag = 0;
                break;
            }
        }
        if (flag == 1) System.out.println("YES, String is numeric.");
        else System.out.println("NO, it is not numeric.");
    }
}
