package com.streamliners.task3.task3_1;

public class Main {
    public static void main(String[] args) {
        Product apple = new Product("Apple", 100);
        Product apple1 = new Product("Apple", 100);
        Product orange = new Product("Orange", 80);

        System.out.println(apple.toString());
        System.out.println(apple1.toString());
        System.out.println(orange.toString());

        System.out.println("The equality of apple and apple1 is " + apple.equals(apple1));

        SpecialProduct specialProduct = SpecialProduct.applyOffOnProduct(apple, 20);
        System.out.println(specialProduct.toString());
    }
}
