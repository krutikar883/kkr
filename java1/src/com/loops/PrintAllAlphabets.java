package com.loops;
import java.util.Scanner;
public class PrintAllAlphabets {

	public static void main(String[] args) {
		// To print all alphabets a to z
		
		Scanner sc=new Scanner(System.in);
		
		
		for (char ch ='a'; ch<='z';ch++)
		{
			System.out.println(ch+" ");
		}

	}

}
