package com.loops;
import java.util.Scanner;
public class OddNum521to229 {

	public static void main(String[] args) {
		// To print odd num from 521 to 229 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("List of odd numbers from 521 to 229:");
		int n= 229,i=521;
		
		while(i>=n)
		{
			if(i%2==1)
			{
				System.out.println(i+ " ");
			}
			i--;
		}
		

	}

}
