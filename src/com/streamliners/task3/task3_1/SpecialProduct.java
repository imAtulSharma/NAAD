package com.streamliners.task3.task3_1;

public class SpecialProduct extends Product {
    int mRegularPrice;
    int mPercentageOff;

    private SpecialProduct(String name, int price) {
        super(name, price);
    }

    public static SpecialProduct applyOffOnProduct(Product product, int percentageOff) {
        int discountedPrice = product.getPrice() - product.getPrice()*percentageOff/100;

        SpecialProduct specialProduct = new SpecialProduct(product.getName(), discountedPrice);
        specialProduct.mRegularPrice = product.getPrice();
        specialProduct.mPercentageOff = percentageOff;

        return specialProduct;
    }

    @Override
    public String toString() {
        return String.format("Name : %s @ Rs. %d, Regular Price : Rs. %d with Percentage Off : %d", this.getName(), this.getPrice(), mRegularPrice, mPercentageOff);
    }
}
