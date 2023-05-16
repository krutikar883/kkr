package com.While;
import java.util.Scanner;
public class PalindromeNumber {

	public static void main(String[] args) {
		// to check whether the num is palindrome num or not
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=sc.nextInt();
		int reversenum = 0, rem, originalnum = num;
		while(num>0)
		{
			rem=num%10;
			reversenum = reversenum * 10 + rem;
			num=num/10;
		}
		if(originalnum == reversenum )
			System.out.println("is a palindrome number");
		else
			System.out.println("is not a palindrome number");
			

	}

}
