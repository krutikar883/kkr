package com.While;
import java.util.Scanner;
public class NumOfOddNum {

	public static void main(String[] args) {
		//num of odd num
		Scanner sc=new Scanner(System.in);
		
		int i=1;
		int count=0;
		while(i<=20)
		{
			if(i%2!=0)
			{
				count++;
			}
			i++;
			
		}
		System.out.println("odd numbers betweeen 1 to 20 is:" + count);
		

	}

}
