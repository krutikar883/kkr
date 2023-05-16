package com.oops;
import java.util.Scanner;
public class Booking {

	public static void main(String[] args) {
		
		
		Movie m = new Movie(1203, " krutika", 200);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter movie name");
		String name=sc.next();
		System.out.println("Enter coupon");
		int coupon =sc.nextInt();
		
		int price = m.getPrice();
		m.Show_details();
		if(coupon==100)
		{
			System.out.println("price="+(price-price*0.15));
		}
		else if(coupon==200)
		{
			System.out.println("price="+(price-price*0.1));
		}
		else
		{
			System.out.println("no discount");
		}
		System.out.println("Enjoy the movie");

	}

}
