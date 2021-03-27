package com.streamliners.task2;

import java.util.*;

public class GetOccurrenceHashMap {
    public static HashMap<Integer, Integer> getOccurrencesHashMap(String s) {
        HashMap<Integer, Integer> hm = new HashMap<>();

        int previous = -1;
        String[] stringArray = s.split(";");

        int[] array = new int[stringArray.length];

        for (int i = 0; i < stringArray.length; i++) {
            array[i] = Integer.parseInt(stringArray[i]);
        }
        Arrays.sort(array);

        for (int next: array) {
                if (next != previous) {
                    hm.put(next, 1);
                } else {
                    hm.replace(next, hm.get(next) + 1);
                }
                previous = next;
        }
        return hm;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter numeric separated by semicolon(;): ");
        String str = sc.nextLine();

        System.out.println("The occurrences are the following:");

        HashMap<Integer, Integer> hm = getOccurrencesHashMap(str);
        for (Map.Entry<Integer, Integer> entry: hm.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
