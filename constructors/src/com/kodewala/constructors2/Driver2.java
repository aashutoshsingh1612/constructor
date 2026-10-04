package com.kodewala.constructors2;
class Invoice extends Object
{
	int amount;
	  String itemName;
	  String billingAddress;
	  String customerId;
	  String custmoerName;
	  
	  Invoice(int _amount, String _itemName, String _billingAddress, String _custmoerId, String _customerName)
	  {
		  this.amount = _amount;
		  this.itemName = _itemName;
		  this.billingAddress = _billingAddress;
		  this.customerId = _custmoerId;
		  this.custmoerName =_customerName;
		  
	  }
}

public class Driver2 {

	public static void main(String[] args)
	{
		Invoice inv = new Invoice (18000, "iphone18", "kodewala BTM", "C1236", "harsh");
		
		System.out.println(inv.amount);
		System.out.println(inv.itemName);
		System.out.println(inv.billingAddress);
		System.out.println(inv.customerId);
		System.out.println(inv.custmoerName);

	}

}
