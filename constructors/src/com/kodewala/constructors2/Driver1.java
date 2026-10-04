package com.kodewala.constructors2;

class Invoice extends Object{
	
	static int gst = 18;
	
	int amount;
	String itemName;
	String billingAddress;
	String customerId;
	String customerName;
	
	Invoice(int _amount, String _itemName, String _billingAddress, String _customerId, String _customerName)
	{
		 this.amount = _amount;
		 this.itemName = _itemName;
		 this.billingAddress = _billingAddress;
		 this.customerId = _customerId;
		 this.customerName = _customerName;
		 
	}
}

public class Driver1 {

	public static void main(String[] args)
	{
		Invoice inv = new Invoice (18000, "iphone18", "kodewala BTM", "C1236", "harsh");
		
		Invoice inv1 = new Invoice (1500, "oppo", "munger", "C859600", "shivam");
		
		System.out.println("frist invoice : "+ inv.amount+", "+inv1.customerId+" );
		
	}
}
