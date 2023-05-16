package LabSession1;
import java.util.Scanner;
public class LabSession3 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		
		if(age<=0)
		{
			System.out.println("Invalid age");
		}
		else
		{
			int coins = age*age*age;
			System.out.println("meenu gets coins: " +coins);
		}
		
	}

}
