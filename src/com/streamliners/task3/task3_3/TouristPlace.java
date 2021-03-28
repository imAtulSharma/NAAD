package com.streamliners.task3.task3_3;

import java.util.ArrayList;
import java.util.List;

public class TouristPlace {
    String name;
    String workingHour;
    int entryTicketPrice;
    int noOfRatings;
    float starRating;
    List<String> famousFor;

    TouristPlace(String name, String workingHour, int entryTicketPrice) {
        this.name = name;
        this.workingHour = workingHour;
        this.entryTicketPrice = entryTicketPrice;

        noOfRatings = 0;
        starRating = 0;
        famousFor = new ArrayList();
    }

    public void rate(int stars) {
        starRating = starRating*noOfRatings + stars;
        noOfRatings++;
        starRating /= noOfRatings;
    }

    public TouristPlace addFamousFor(String s) {
        this.famousFor.add(s);
        return this;
    }

    public boolean isPlaceOpen() {
        return true;
    }
}
