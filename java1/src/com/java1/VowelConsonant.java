package com.java1;
import java.util.Scanner;
public class VowelConsonant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a character :");
		char ch =sc.next().charAt(0); 
		if(ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u'||ch == 'A' ||ch == 'E' ||ch == 'I' ||ch =='O' ||ch == 'U')
			
		{
			System.out.println("character is an vowel");
		}

		else if ((ch>='a' && ch<='z')||(ch>='A' && ch<='Z'))
		{
			System.out.println("character is a consonant");
		}
		
		
		

	}

}
