package com.mall.constructor;

public class Driver1 {
	
	public static void main(String[] args) {
		
        Product p1 = new Product(
            "Laptop",
            55000,
            "Dell Laptop",
            2
        );

        
        Product p2 = new Product(
            "Mobile",
            "Samsung Smartphone"
        );

       
        Product p3 = new Product();

        p1.display();
        p2.display();
        p3.display();
    }
	}


