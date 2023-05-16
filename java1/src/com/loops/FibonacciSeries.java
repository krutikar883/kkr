package com.loops;
import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		// 0+1=1, 1+1=2, 2+1=3, 3+2=5, 5+3=8, 8+5=13...
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of terms:");
		int num=sc.nextInt();
		int t1=0; 
		int t2=1;
		System.out.println(t1 + " " + t2 + " ");
		for(int i=1; i<num; i++)
		{
			int sum=t1+t2;
			System.out.println(sum + " ");
			t1=t2;
			t2=sum;
			
			
		}
		

	}

}
