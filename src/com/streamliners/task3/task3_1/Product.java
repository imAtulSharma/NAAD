package com.streamliners.task3.task3_1;

public class Product {
    private String mName;
    private int mPrice;

//    Defining constructors
    Product() {

    }
    Product(String name, int price) {
        this.mName = name;
        this.mPrice = price;
    }

//    Define getter for name and price both
    public String getName() {
        return mName;
    }
    public int getPrice() {
        return mPrice;
    }

    @Override
    public boolean equals(Object o) {
        Product product = (Product) o;

        return this.mName.equals(product.getName());
    }

    @Override
    public String toString() {
        return String.format("Name : %s @ Rs. %d", mName, mPrice);
    }
}
