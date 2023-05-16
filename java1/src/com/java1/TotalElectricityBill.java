package com.java1;
import java.util.Scanner;
public class TotalElectricityBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		System.out.println("electricity unit :");
		int unit = reader.nextInt();
	    float amt,surcharge,bill_amt;
		if(unit <= 50)
		{
			amt = unit*0.50f;
		}
		else if(unit <= 100)
		{
			amt = unit*0.75f;
			
			
		}
		else if(unit <= 100)
		{
			amt = unit*1.20f;
		}
		else
		{
			amt = unit*1.50f;
		}
		surcharge = amt*0.2f;
		bill_amt = amt+surcharge;
		System.out.println("total electricity bill is :" +bill_amt);
		
		

	}

}
