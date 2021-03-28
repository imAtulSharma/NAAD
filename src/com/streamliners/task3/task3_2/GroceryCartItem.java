package com.streamliners.task3.task3_2;

public class GroceryCartItem extends GroceryItem {
    float mPrice;
    float mQuantity;

    private GroceryCartItem(String name, int price) {
        super(name, price);
    }

    @Override
    public String toString() {
        return String.format("%s (₹%d X %.2fkg) = ₹%.1f", this.getName(), this.getPricePerKg(), this.mQuantity, this.mPrice);
    }

    public static float extractQuantity(String quantityStr) {
        String[] weightInString = quantityStr.split(" ");
        int[] weightInInteger = {Integer.parseInt(weightInString[0].replace("kg", "")), Integer.parseInt(weightInString[1].replace("g", ""))};

        double f = weightInInteger[0] + weightInInteger[1]*Math.pow(10, -3);

        return (float) f;
    }

    public static GroceryCartItem createNew(GroceryItem item, String quantityStr) {
        GroceryCartItem gci = new GroceryCartItem(item.getName(), item.getPricePerKg());
        gci.mQuantity = GroceryCartItem.extractQuantity(quantityStr);
        gci.mPrice = gci.mQuantity*gci.getPricePerKg();

        return gci;
    }
}
