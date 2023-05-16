package LabSession1;

public class Student {
	 private String name;
	    private int age;
	    private String address;

	    //First method has 2 parameterized for name & age
	    public void set_Info(String name, int age) {
	        this.name = name;
	        this.age = age;
	    }

	    //second method has 3 parameterized for name , age and address 
	    public void set_Info(String name, int age, String address) {
	        this.name = name;
	        this.age = age;
	        this.address = address;
	    }
	    
	    // print name , age, address
	    public void printInfo() {
	        System.out.println("Name: " + name);
	        System.out.println("Age: " + age);
	        System.out.println("Address: " + address);
	    }

	public static void main(String[] args) {
		Student student = new Student();
        student.set_Info("Krutika", 23);
        student.printInfo(); // Output: Name: Krutika, Age: 23, Address: null

        student.set_Info("Mrunal", 21, "Manish Nagar");
        student.printInfo(); // Output: Name: Mrunal, Age: 21, Address: Manish Nagar
    
}

	

}
