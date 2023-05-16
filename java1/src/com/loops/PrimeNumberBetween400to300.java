package com.loops;
import java.util.Scanner;
public class PrimeNumberBetween400to300 {

	public static void main(String[] args) {
		// find prime numbers between 400 to 300
		
		Scanner sc=new Scanner(System.in);
		System.out.println("prime numbers between 400 to 300:");
		int num=sc.nextInt();
		
		
		
		for(int i=2;i<=num;i++)
		{
			if(num%i==0)
			{
				System.out.println(i + "");
			}
		}
		

	}

}
