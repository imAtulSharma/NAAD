package com.streamliners.task0.introduction;

import java.util.Scanner;
import java.math.*;

public class QuadraticRoots {
    public static void main(String[] args) {
        //        initialing scanner to input stream
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the co-efficient of x^2 i.e. a");
        double a = sc.nextDouble();

        System.out.println("Enter the co-efficient of x i.e. b");
        double b = sc.nextDouble();

        System.out.println("Enter the constant i.e. c");
        double c = sc.nextDouble();

        double root1 = (-b + Math.sqrt(b*b-4*a*c))/(2*a);
        double root2 = (-b - Math.sqrt(b*b-4*a*c))/(2*a);

        System.out.println("The roots of the equation are " + root1 + " and " + root2);
    }
}
