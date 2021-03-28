package com.streamliners.task3.task3_3;

public class Main {
    public static void main(String[] args) {
        TouristPlace jpr = new TouristPlace("Amer","10:00Am to 5.00PM",100);
        jpr.addFamousFor("Jaipur History").addFamousFor("Lake").addFamousFor("Mountains");

        jpr.rate(5);
        jpr.rate(4);
        jpr.rate(3);

        System.out.println("Rating is " + jpr.starRating);
    }
}
