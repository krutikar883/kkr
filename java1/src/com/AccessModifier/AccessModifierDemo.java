package com.AccessModifier;

public class AccessModifierDemo {
	
	private int x = 10;
	
	int y = 20;
	
	protected int z = 40;
	public String city = "nagpur";
	
	private void doPrivate()
	{
		System.out.println("This is private");
	}
	

	public static void main(String[] args) {
		AccessModifierDemo a = new AccessModifierDemo();
		
		System.out.println(a.x);
		a.doPrivate();
		
		System.out.println(a.y);
		System.out.println(a.z);
		System.out.println(a.city);

	}

}
