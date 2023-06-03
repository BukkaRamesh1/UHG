package com.sample.sweta;





public class customer extends Address {
	
	customer(){
		System.out.println("default construrctor called");
	}
	void Customer(String firstname, String lasttname){
		this.firstname = firstname;
		
		
	}
	
	public customer(String firstname, String lasttname, Transactions trans) {
		super();
		this.firstname = firstname;
		this.lasttname = lasttname;
		this.trans = trans;
	}

	public  long customerid;
	public String firstname;
	public String lasttname;
	private double amount;
	protected boolean status;

	private Transactions trans;
	
	
	 static int b; // Global variable 
	static final int  id = 10;

	public static void addCustomer(String firstname,String lasttname ) {
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


