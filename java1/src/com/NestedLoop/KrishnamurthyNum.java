package com.NestedLoop;
import java.util.Scanner;
public class KrishnamurthyNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int num=sc.nextInt();
		
		int sum=0;
		int digit;
		int fact = 1;
		int temp = num;  //store the original num
		while(num>=0)
		{
			digit=num%10;   // get last digit of num
			
			sum=sum + fact;
			num=num/10;
		}
		if(sum==temp)
			System.out.println(num + "is a krishnamurthy number");
		else
			System.out.println(num + "is not a krishnamurthy number");

	}

}
