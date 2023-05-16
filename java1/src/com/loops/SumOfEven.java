package com.loops;
import java.util.Scanner;
public class SumOfEven {

	public static void main(String[] args) {
		// to find display the sum of even nos. between 1 to 20
		Scanner sc = new Scanner(System.in);
		
		int sum =0;
		for(int i=2; i<=20; i++)
		{
			if(i%2==0)
			{
			sum=sum+i;
			}
		}
		System.out.println("The sum of all even numbers between 1 to 20 is " +sum);
		

	}

}
