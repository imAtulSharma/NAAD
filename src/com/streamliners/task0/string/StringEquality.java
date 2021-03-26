package com.streamliners.task0.string;

public class StringEquality {
    public static void main(String[] args) {
        /**
         * String str1 = "hello";
         * String str2 = "hello";
         * This will give TRUE why?
         * Because may be the memory address is same (somehow java find these equal means the object is one only there are two references)
         */
        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }
}
