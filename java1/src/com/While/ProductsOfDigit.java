package com.While;
import java.util.Scanner;
public class ProductsOfDigit {

	public static void main(String[] args) {
		// to calculate the product of digit
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int product=1;
		
		while(num!=0)
		{
			int digit=num%10;
			num=num/10;
			product=product*digit;
			
		}
		System.out.println("Product of digits:" +product);
		

	}

}
