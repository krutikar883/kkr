package com.NestedLoop;
import java.util.Scanner;
public class DisariumNum {

	public static void main(String[] args) {
		// disarium num = 175= 1^1 + 7^2 + 5^3 = 1+49+125=175
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int copy=num;
		int sum=0;
		int count=0;
		
		while(num>0)
		{
			count++;
			num=num/10;
		}
		System.out.println(count);
		num=copy;
		while(num>0)
		{
			int digit=num%10;
			int power=1;
			for(int i=1; i<=count;i++)
			{
				power=power+sum;
			}
			sum=sum+power;
			num=num/10;
			count--;
			
		}
		
		if(sum==num)
		{
			System.out.println("is a disarium number");
		}
		else {
			System.out.println("is not a disarium number");
			
		}

	} 
	
	

}
