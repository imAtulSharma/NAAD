package com.streamliners.task0.string;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class StringToDate {
    public static void main(String[] args) {
        //        initialing scanner to input stream
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter date in dd-mm-yyyy format: ");
        String str = sc.nextLine();
        try {
            Date date = new SimpleDateFormat("dd-MM-yyyy").parse(str);
            System.out.println(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
