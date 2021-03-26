package com.streamliners.task0.arrays;

import java.util.Scanner;

public class ConcatenateArray {
    public static void main(String[] args) {
//        initialing scanner to input stream
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements in the first array: ");
        int n1 = sc.nextInt();
        int[] firstArray = new int[n1];

        System.out.println("Now enter the array");
        for (int i = 0; i < n1; i++) {
            firstArray[i] = sc.nextInt();
        }

        System.out.print("Enter the number of elements in the second array: ");
        int n2 = sc.nextInt();
        int[] secondArray = new int[n2];

        System.out.println("Now enter the array");
        for (int i = 0; i < n2; i++) {
            secondArray[i] = sc.nextInt();
        }

        int[] resultArray = new int[n1+n2];
        for (int i = 0; i < n1; i++) {
            resultArray[i] = firstArray[i];
        }
        for (int i = n1;i < n1+n2; i++) {
            resultArray[i] = secondArray[i-n1];
        }

//        Printing the concatenated Array
        System.out.print("The concatenated Array is {");

        for (int i = 0; i < n1+n2; i++) {
            System.out.print("" + resultArray[i] + ", ");
        }
        System.out.print("\b\b}");
    }
}
