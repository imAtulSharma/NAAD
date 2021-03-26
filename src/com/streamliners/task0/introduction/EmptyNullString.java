package com.streamliners.task0.introduction;

import java.util.Scanner;

public class EmptyNullString {
    public static void main(String[] args) {
//        initialing scanner to input stream
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a string: ");
        String str = sc.nextLine();

//        check the status of the string
        if(str == null || str.isEmpty()) {
            System.out.println("String is Empty or Null");
            return;
        }

//        Printing the result
        System.out.println("String is not Empty or Null");
    }
}
