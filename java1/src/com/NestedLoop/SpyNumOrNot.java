package com.NestedLoop;
import java.util.Scanner;
public class SpyNumOrNot {

	public static void main(String[] args) {
		// to check whether number is spy num or not
		// digit of sum & digit of product is equal then the num is spy num.
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int product=1, sum=0, digit;
		while(num>0)
		{
			digit=num%10;
			sum=sum+digit;
			product=product*digit;
			num=num/10;
		}
		if(sum==product)
			System.out.println("is a spy number");
		else
			System.out.println("is not a spy number");

	}

}
