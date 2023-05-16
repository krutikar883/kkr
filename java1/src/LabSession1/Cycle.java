package LabSession1;

public class Cycle {
	private int accountNo;
    private int noOfWheels;

    // Default constructor
    public Cycle() {
        System.out.println("I am default constructor");
    }

    // Parameterized constructor
    public Cycle(int accountNo, int noOfWheels) {
        this();  // calling default constructor using "this" keyword
        this.accountNo = accountNo;
        this.noOfWheels = noOfWheels;
        System.out.println("I am another constructor");
    }

    // Getter methods
    public int getAccountNo() {
        return accountNo;
    }

    public int getNoOfWheels() {
        return noOfWheels;
    }


	public static void main(String[] args) {
		// create an object using default constructor
		Cycle cycle1 =new Cycle();  // O/P: I am default constructor
		
		//create an object using parameterized constructor
		Cycle cycle2 = new Cycle(12378, 2);
		// O/P: I am another constructor
		
		System.out.println("Cycle 1 Account Num:" +cycle1.getAccountNo());
		System.out.println("Cycle 2 Account Num:" +cycle2.getAccountNo());
		
		System.out.println("Cycle 1 Num of Wheels:" +cycle1.getNoOfWheels());
		System.out.println("Cycle 2 Num of Wheels:" +cycle2.getNoOfWheels());

	}

}
