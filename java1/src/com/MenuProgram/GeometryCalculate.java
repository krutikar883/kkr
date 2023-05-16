package com.MenuProgram;
import java.util.Scanner;
public class GeometryCalculate {

	public static void main(String[] args) {
		// to calculate area of square,triangle,rectangle,circle
		
		Scanner sc=new Scanner(System.in);
		 char ch;
		 do {
			 System.out.println("Enter a number");
				System.out.println("1.Area of a Circle \n 2. Area of Square \n 3. Area of Triangle \n 4. Area of Rectangle");
				System.out.println("Enter your option:");
				
				int choice = sc.nextInt();
				switch(choice)
				{
				case 1:
					System.out.println("Enter radius:");
		            float r=sc.nextFloat();
		            float ac=3.14f*r*r;
		           System.out.println("Area:"+ac);
		           break;
				case 2:
					System.out.println("Enter side:");
					int m=sc.nextInt();
		            int as=m*m;
		           System.out.println("Area:"+as);
		           break;
				case 3:
					System.out.println("Enter height and base:");
					float bs=sc.nextInt();
					float h=sc.nextInt();
					float at=0.5f*bs*h;
					System.out.println("Area:"+at);
					break;
				case 4:
					System.out.println("Enter length and breadth:");
					int b=sc.nextInt();
		            int l=sc.nextInt();
		            int ar=l*b;
		           System.out.println("Area:"+ar);
		           break;
		           
		           default:
		        	   System.out.println("Invalid");
				}
				System.out.println("Do you want to continuee...");
				
				ch= sc.next().charAt(0);
				
				
				
		
		 } while(ch=='y' || ch=='Y');
		

	}

}
