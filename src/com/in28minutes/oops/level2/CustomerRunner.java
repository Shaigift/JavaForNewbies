package com.in28minutes.oops.level2;

public class CustomerRunner {
	public static void main(String[] args) {
		
		Address homeAddress = new Address("line 1", "Hyderabad", "500035");
		Customer customer = new Customer("Ranga", homeAddress);
		
		Address workAddress = new Address("line 1 got work", "Hyderabad", "500037");
		customer.setWorkAddress(workAddress);
		
		System.out.println(customer);
	}

}
