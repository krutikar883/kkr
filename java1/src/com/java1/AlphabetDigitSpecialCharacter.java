package com.java1;
import java.util.Scanner;
public class AlphabetDigitSpecialCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Character");
		char ch = sc.next().charAt(0);
		if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
		{
			System.out.println("character is an alphabet");
		}
		else if(ch>='0' && ch<='9')
		{
			System.out.println("character is digit");
		}
		else
		{
			System.out.println("character is a special character");
		}

	}

}
