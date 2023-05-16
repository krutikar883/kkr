package com.java1;
import java.util.Scanner;
public class UpperCaseLowerCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a character :");
		char ch =sc.next().charAt(0);
		if(ch>= 'A' && ch<= 'Z')
		{
			ch=(char)(ch+32);
		}
		else if (ch >= 'a' && ch<= 'z')
		{
			ch=(char)(ch-32);
		}
		else
		{
			ch=ch;
		}
		System.out.println(ch);

	}

}
