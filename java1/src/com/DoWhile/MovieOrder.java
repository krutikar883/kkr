package com.DoWhile;
import java.util.Scanner;
public class MovieOrder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int pizzaPrice=100;
		int puffPrice=20;
		int coldDrinkPrice=10;
		int totalPrice=0;
		
		int choice;
		do {
			System.out.println("1.Pizza" + pizzaPrice);
			System.out.println("2.Puff" + puffPrice);
			System.out.println("3.ColdDrink" + coldDrinkPrice);
			System.out.println("Exit");
			System.out.println("Enter the choice number from 1 to 3");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				System.out.println("Enter the quantity of pizzas:");
				int pizzaQuantity = sc.nextInt();
				totalPrice= totalPrice + pizzaQuantity * pizzaPrice;
				break;
			case 2:
				System.out.println("Enter the quantity of puff:");
				int puffQuantity = sc.nextInt();
				totalPrice= totalPrice + puffQuantity * puffPrice;
				break;
			case 3:
				System.out.println("Enter the quantity of Cold Drink");
				int coldDrinkQuantity = sc.nextInt();
				totalPrice = totalPrice + coldDrinkQuantity * coldDrinkPrice;
				break;
			default:
				System.out.println("Invalid Input");
				break;
				
			
		}
		} while(choice !=0);
		System.out.println("totalPrice is" +totalPrice);
					

		
		 
		

	}

}
