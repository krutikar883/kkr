package com.While;
import java.util.Scanner;
public class EvenNumber {

	public static void main(String[] args) {
		// Even Number
		Scanner sc=new Scanner(System.in);
		
		int i=1;
		while(i<=10)
		{
			if(i%2==0)
			{
				System.out.println(i);
			}
			i++;
		}
		

	}

}
