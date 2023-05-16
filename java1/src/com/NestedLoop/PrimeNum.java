package com.NestedLoop;
import java.util.Scanner;
public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		
		int i=2;
		boolean isprime =  true;
		// int count;
		while(i<num)
		{
			if(num%i==0)
			{
				isprime=false;
				//count=1;
				break;
			}
			i++;
		}
		//if(count==0)
		if(isprime==true)
		{
			System.out.println("Prime");
			
		}
		else
		{
			System.out.println("Not Prime");
		}

	}

}
