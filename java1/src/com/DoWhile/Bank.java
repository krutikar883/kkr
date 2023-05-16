package com.DoWhile;
import java.util.Scanner;
public class Bank {

	public static void main(String[] args) {
		int balance = 1000;
		int pin = 1999;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		char ch;
		
		
		do
		{
			System.out.println("Welcome to SBI ATM");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			System.out.println("Enter your choice");
			int choice = sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter deposite:");
				int deposite = sc.nextInt();
				balance = balance + deposite;
				System.out.println("Deposite amount =" +balance);
				break;
			case 2:
				System.out.println("Enter Withdraw");
				int withdraw = sc.nextInt();
				if(withdraw > balance) {
					System.out.println("Withdear not allow");
				}else {
					balance = balance - withdraw;
					System.out.println("withdraw amount =" +balance);
				}
				
				break;
			case 3:
				System.out.println("Check Balance="+balance);
				break;
			default:
				System.out.println("Invalid choice");
			}
			System.out.println("Do you want to continue");
			ch= sc.next().charAt(0);
			
		} while(ch == 'y' || ch == 'Y');
		
		

	}

}
