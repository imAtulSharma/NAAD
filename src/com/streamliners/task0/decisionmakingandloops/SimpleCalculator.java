package com.streamliners.task0.decisionmakingandloops;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        //        initialing scanner to input stream
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter first number: ");
        double a = sc.nextDouble();

        System.out.print("Please enter second number: ");
        double b = sc.nextDouble();

        System.out.print("Enter operation to be performed between them (choose from +, -, *, / and %): ");
        char ch = sc.next().charAt(0);

        double result;

        switch (ch) {
            case '+': result = a + b;
            break;
            case '-': result = a - b;
            break;
            case '*': result = a * b;
            break;
            case '/': result = a / b;
            break;
            case '%': result = a % b;
            break;
            default:
                System.out.println("Please choose correct operation from +, -, *, / and %");
                return;
        }
        System.out.println("The result is " + result);
    }
}
