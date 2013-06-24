package com.olabsys.serialization;

public class Balance extends Exception {
	private int price;
	public Balance(int price)
	{
		this.price=price;
	}
	public String toString()
	{
		return "price is less" +price;
	}

}
