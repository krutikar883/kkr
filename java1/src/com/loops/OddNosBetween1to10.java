package com.loops;
import java.util.Scanner;
public class OddNosBetween1to10 {

	public static void main(String[] args) {
		// odd nos. between 1 to 10
		Scanner sc = new Scanner(System.in);
		System.out.println("The odd numbers betwwen 1 to 10:");
		
		for(int i=1; i<=10; i++)
		{
			if(i % 2 != 0)
			{
				System.out.println(i + "");
			}
		}
		

	}

}
