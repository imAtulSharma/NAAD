package com.streamliners.task1;

import java.util.Scanner;

public class DirectlyProportional {
    public static boolean isDirectlyProportional(int[] x, int[] y) {
        float ratio = (float) x[0] / y[0];

        for (int i = 1; i < x.length; i++) {
            if ((float) x[i]/y[i] != ratio) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the number of elements: ");
        int n = sc.nextInt();

        System.out.print("Please enter the elements of x: ");
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = sc.nextInt();
        }

        System.out.print("Please enter the elements of y: ");
        int[] y = new int[n];
        for (int i = 0; i < n; i++) {
            y[i] = sc.nextInt();
        }

        System.out.println("The proportionality of x and y is " + isDirectlyProportional(x, y));
    }
}
