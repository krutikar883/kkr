package com.NestedLoop;
import java.util.Scanner;
public class ArmstrongNum {

	public static void main(String[] args) {
		// TODO Auto-generated
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		
		int temp=num;
		int sum=0;
		while(num>0)
		{
			int digit=num%10;
			sum=sum+(digit*digit*digit);
			num=num/10;
		}
		System.out.println(sum);
		num=temp;
		if(sum==num)
		{
			System.out.println("number is armstrong");
		}
		else
		{
			System.out.println("number is not an armstrong");
		}

	}

}
