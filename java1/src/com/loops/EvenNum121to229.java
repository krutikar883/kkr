package com.loops;
import java.util.Scanner;
public class EvenNum121to229 {

	public static void main(String[] args) {
		// To print even number 121 to 229
		
		Scanner sc=new Scanner(System.in);
		int n=229;
		System.out.println("List of even numbers from 121 to 229");
		
		for(int i=121; i<=n; i++)
		{
			if(i%2==0)
			{
				System.out.println(i+ "");
			}
		}
	}

}
