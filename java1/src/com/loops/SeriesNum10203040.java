package com.loops;
import java.util.Scanner;
public class SeriesNum10203040 {

	public static void main(String[] args) {
		// 10,20,30,40...
		
		Scanner sc =new Scanner(System.in);
		
		int num=10;

		for(int i=1; i<=10; i++)
		{
			System.out.print(num + " ");
			num=num+10;
		}

	}

}
