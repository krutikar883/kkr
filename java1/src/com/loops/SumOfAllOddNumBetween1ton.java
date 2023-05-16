package com.loops;
import java.util.Scanner;
public class SumOfAllOddNumBetween1ton {

	public static void main(String[] args) {
		// sum of odd num between 1 to n
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		int num=sc.nextInt();
		
		int sum=0;
		
		for(int i=1; i<=num; i++)
		{
			if(i%2==1)
				sum=sum+i;
			
		}
		System.out.println("Sum of odd number between 1 to n:" +sum);
			
	}

}
