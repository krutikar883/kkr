package com.DoWhile;
import java.util.Scanner;
public class EvenNum121to229 {

	public static void main(String[] args) {
		// To print even num from 121 to 229
		
		Scanner sc=new Scanner(System.in);
		System.out.println("List of even number from 121 to 229:");
		
		int num=121;
		
		do
		{
			if(num%2==0)
			{
				System.out.println(num);
			}
			num++;
		}while(num<=229);

		

	}

}
