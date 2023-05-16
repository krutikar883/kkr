package com.While;
import java.util.Scanner;
public class ReverseNum {

	public static void main(String[] args) {
		// to find the reverse number
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int reversenum=0;
		
		while(num>0)
		{
			int digit=num%10;
			reversenum=reversenum*10+digit;
			num=num/10;
		}
		System.out.println(reversenum);
	}

}
