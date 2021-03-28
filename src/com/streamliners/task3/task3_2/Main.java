package com.streamliners.task3.task3_2;

public class Main {
    public static void main(String[] args) {
        GroceryItem sugar = new GroceryItem("Sugar", 35);
        GroceryItem jaggery = new GroceryItem("Jaggery", 40);
        GroceryItem apple = new GroceryItem("Apple", 100);
        GroceryItem mango = new GroceryItem("Mango", 60);

        Cart cart = new Cart();
        cart.add(GroceryCartItem.createNew(sugar, "3kg 0g"))
                .add(GroceryCartItem.createNew(jaggery, "0kg 750g"))
                .add(GroceryCartItem.createNew(apple, "1kg 500g"))
                .add(GroceryCartItem.createNew(mango, "3kg 500g"));

        System.out.println(cart.toString());
    }
}
