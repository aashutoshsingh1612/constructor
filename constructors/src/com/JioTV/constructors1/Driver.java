package com.JioTV.constructors1;

public class Driver {

	public static void main(String[] args) {
		
		ElectronicProduct electronicProduct = new ElectronicProduct("Iphone", 18000, "C1222", 2);
		
		System.out.println(electronicProduct.name);
		System.out.println(electronicProduct.price);
		System.out.println(electronicProduct.productId);
		System.out.println(electronicProduct.warranty);
		
		
		ElectronicProduct electronicProduct1 = new ElectronicProduct("Iphone", 18000, "C1222", 2);
		
		System.out.println(electronicProduct1);
	}

}
