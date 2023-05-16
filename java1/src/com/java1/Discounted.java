package com.java1;

public class Discounted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double price, disprice, discount;
		price = 24000;
		if(price < 10000)
		{
			discount = (24000 * 5)/100;
		}
		else if(price > 10000 && price < 25000)
		{
			discount = (24000 * 10)/100;
		}
		else if(price > 25000 && price < 50000)
		{
			discount = (24000 * 15)/100;
		}
		else
		{
			discount = (24000 * 20)/100;
		}
		

		System.out.println("disprice =" + discount);

			
		
			

	}

}
