package com.JioTV.constructors1;

public class ElectronicProduct extends Product
{

	int warranty;
	
	public ElectronicProduct(String _name, int _price, String _productId, int _warrany) {
		
		super(_name, _price, _productId);
	    this.warranty = _warrany;
	}
	
	}


