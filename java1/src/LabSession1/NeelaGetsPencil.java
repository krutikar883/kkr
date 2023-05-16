package LabSession1;
import java.util.Scanner;
public class NeelaGetsPencil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int standard;
		 
		 do
		 {
			 System.out.println("Enter neela's standard from 1 to 12:");
			 standard = sc.nextInt();
			 if(standard < 1 || standard > 12)
			 {
				 System.out.println("Invalid Standard");
			 }
		 } while(standard < 1 || standard > 12);
			int pencils=0;
			for(int i=1; i<=standard; i++)
			{
				pencils= i*i + pencils;
			}
			System.out.println("Neela gets pencils :" +pencils);
	
		 
	
	
		

	}

}
