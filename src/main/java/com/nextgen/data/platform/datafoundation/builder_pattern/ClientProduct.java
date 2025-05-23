package com.nextgen.data.platform.datafoundation.builder_pattern;


public class ClientProduct {
    public static void main(String[] args) {
        Product product1 = new Product.ProductBuilder()
                .withName("iPhone 15")
                .withDescription("Latest Apple smartphone")
                .withPrice(1099.99)
                .withCategory("Electronics")
                .withRating(4.8)
                .Build();

        System.out.println(product1);
    }
}
