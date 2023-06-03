package com.sample.sweta;

import com.sample.ramesh.Transactions;
import com.sample.ramesh.customer;

public class test {

}
public static void main(String args[]) {
	int z = 20;
	//for(int i =1; i<z; i++) {
		//System.out.println(i);
	

	for(int i =1; i<z; i++) {
		System.out.println(i);
		
	}
	while (z < 50) {
	//	System.out.println(z);
		//z++;
	}
	do {
		System.out.println(z);
		
		z++;
	}while (z<20);
	
	
	System.out.println("How are you");
	addNumber();
	customer cust = new customer();
	cust.customerid =1233455;
	cust.firstname = "Lisa";
    cust.lasttname = "Flores";
    cust.status = true;
    cust.getCustomer();
    
    cust.method1();
//System.out.println(cust.method1());
    
    Transactions t1 = new Transactions();// aggargation
    t1.zipcode = "1234";
    System.out.print("zipcode");
    
  customer cust1 = new customer("john","Michal",t1);
    
}

private static void addNumber() {
	// TODO Auto-generated method stub
	System.out.println("add two number");

	
	
}


	
}

