package com.streamliners.task0.string;

import java.util.Scanner;

public class SwitchOnStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        switch (str) {
            case "atul":
                System.out.println("This is a name.");
                break;
            case "sharma":
                System.out.println("This is a surname.");
                break;
            default:
                System.out.println("Please enter by noticing code :P");
        }
    }
}
