package LabSession1;
import java.util.Scanner;
public class Book {
	int id;
	String name;
	double price;
	String authorName;
	
	public Book(int id, String name, double price, String authorName)
	{
		this.id=id;
		this.name=name;
		this.price = price;
		this.authorName = authorName;
	}
	
	public void showBook()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a author name");
		String str = sc.next();
		if(authorName.equals(str))
		{
			price=price-50;
			System.out.println("price =" +price);
		}
		else
		{
			
			System.out.println("No discount");
		}
			
	}

	public static void main(String[] args) {
		
		Book book = new Book(101, "Java", 150, "krutika");
		book.showBook();

	}

}
