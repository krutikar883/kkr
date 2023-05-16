package com.While;
import java.util.Scanner;
public class SumofEvenNum {

	public static void main(String[] args) {
		// sum of even number
		
		Scanner sc=new Scanner(System.in);
		int i=1;
		int sum=0;
		while(i<=20)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
			i++;
		}
		System.out.println("The sum of even number is:"+sum);
	}

}
