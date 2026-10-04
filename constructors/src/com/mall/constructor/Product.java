package com.mall.constructor;

public class Product {
    String productName;
    double price;
    String description;
    int quantity;

    Product(String productName, double price, String description, int quantity) {
        this.productName = productName;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
    }

     Product(String productName, String description) {
        this.productName = productName;
        this.description = description;
    }

    
    Product() {
    }

    
    void display() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
        System.out.println("Description: " + description);
        System.out.println("Quantity: " + quantity);
        System.out.println("------------------------");
    }
}


