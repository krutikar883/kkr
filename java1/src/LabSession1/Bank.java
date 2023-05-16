package LabSession1;

public class Bank {
	
	public String b_name = "RBI";
	public int locker_id= 123;
	public float rateofinterest = 45;
	String branch_name= "Manish Nagar";
	
	public String getb_name()
	{
		return b_name;
	}
	private int getLocker_id()
	{
		return locker_id;
	}
	protected float getrateofinterest()
	{
		return rateofinterest;
	}
	String getbranch_name()
	{
		return branch_name;
	}
	
	public void displayDetails()
	{
		System.out.println("Bank Name:" +b_name);
		System.out.println("Locker id:" +locker_id);
		System.out.println("Rate of interest:" +rateofinterest);
		System.out.println("Branch Name:" +branch_name);
	}
	
	public static void main(String[] args)
	{
		Bank b = new Bank();
		System.out.println(b.getb_name());
		System.out.println(b.getLocker_id());
		System.out.println(b.getrateofinterest());
		System.out.println(b.getbranch_name());
		
		
	}

	
		
		
		
		
				

	

}
