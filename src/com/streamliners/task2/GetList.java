package com.streamliners.task2;

import java.util.*;

public class GetList {
    public static List<Integer> getList(String s) {
        List<Integer> list = new ArrayList<>();

        String[] stringList = s.split(";");

        for (String x: stringList) {
            list.add(Integer.parseInt(x));
        }
        return list;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter the numeric string each digit separated by semicolon(;): ");
        String str = sc.nextLine();

        /*
          if semicolon in starting of the string then error comes
         */
        while (str.charAt(0) == ';') {
            str = str.substring(1);
        }

        List<Integer> list = getList(str);

        System.out.print("The list of all the digits in the string is: ");
        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }
}
