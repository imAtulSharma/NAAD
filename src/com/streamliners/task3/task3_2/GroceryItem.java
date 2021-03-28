package com.streamliners.task3.task3_2;

public class GroceryItem {
    private String mName;
    private int mPricePerKg;

    GroceryItem(String name, int pricePerKg) {
        this.mName = name;
        this.mPricePerKg = pricePerKg;
    }

    public String getName() {
        return mName;
    }
    public int getPricePerKg() {
        return mPricePerKg;
    }
}
