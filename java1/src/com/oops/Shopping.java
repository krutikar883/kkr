package com.oops;
import java.util.Scanner;
public class Shopping {
	
	int eid;
	String eproductName;
	double eproductPrice;
	int equantity;
	double bill;
	private void accept_details(int id, String productName, int quantity, int productPrice)
	{
		eid = id;
		eproductName = productName;
		eproductPrice = productPrice;
		equantity = quantity;
		
	}
	public void calculateBill()
	{
		if(equantity>0)
		{
			bill= equantity * eproductPrice;
			
		}
		else
		{
			System.out.println("Invalid quantity");
		}
	}
	public void display()
	{
		System.out.println(eid + " " + eproductName + " " + eproductPrice + " " + equantity);
	}
	
	
	public static void main(String[] args) {
		Shopping s=new Shopping();
		s.accept_details(123, "krutika", 5000,2);
		s.calculateBill();
		s.display();
		
		
		
		
		
	}
	 
		
	

}
