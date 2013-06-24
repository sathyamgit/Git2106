package com.olabsys.serialization;

public class AccountBalance {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws Exception {
		int price=999;
		if(price<1000)
			System.out.println("withdraw success...");
		else
			throw new Balance(price);
		

	}

}
