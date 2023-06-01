package com.sample.ramesh;

public class customer {
	
	customer(){
		System.out.println("default construrctor called");
	}
	void Customer(String firstname, String lasttname){
		this.firstname = firstname;
		
		
	}
	public  long customerid;
	public String firstname;
	public String lasttname;
	private double amount;
	protected boolean status;

	
	
	 static int b; // Global variable 
	static final int  id = 10;

	public static void addCustomer() {
	 System.out.println("add cust executed");
	 int a = 10;
	
}
	public static void getCustomer() {
		int b = 20;
		 System.out.println("add cust executed");
	}
	

public  void updateCustomer() {
	int c = b;
	 System.out.println("add cust executed");
}


public static void deleteCustomer() {
	 System.out.println("add cust executed");
}
}

