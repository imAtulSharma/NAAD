package com.streamliners.task0.decisionmakingandloops;

import java.util.Scanner;

public class PyramidPattern {
    public static void main(String[] args) {
        //        initialing scanner to input stream
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rows of pyramid you want to print? ");
        int n = sc.nextInt();
        int y;

        for (int i = 1; i <= n; i++) {
                y = i;
            for (int a = 1; a <= n-i; a++) {
                System.out.print("  ");
            }
            for (int x = 1; x <= i; x++, y++) {
                System.out.print(y + " ");
            }
            for (y -= 1; y != i; y--) {
                System.out.print(y-1 + " ");
            }
            System.out.print("\n");
        }
    }
}
