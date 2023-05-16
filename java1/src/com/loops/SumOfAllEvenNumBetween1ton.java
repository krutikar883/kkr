package com.loops;
import java.util.Scanner;
public class SumOfAllEvenNumBetween1ton {

	public static void main(String[] args) {
		// to find sum of all even number between 1 to n
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of n");
		int n=sc.nextInt();
		int sum=0;
		int i;
		for(i=2;i<=n;i++)
		{
			if(i%2==0)
			sum+=i;
		}
		System.out.println("sum of all numbers between 1 to n:" +sum);

	}

}
