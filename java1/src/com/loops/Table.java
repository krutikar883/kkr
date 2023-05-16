package com.loops;
import java.util.Scanner;
public class Table {

	public static void main(String[] args) {
		// to find out the table of given no.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();
		for(int i=1; i<=10; i++)
		{
			System.out.println(num*i);
		}
		

	}

}
