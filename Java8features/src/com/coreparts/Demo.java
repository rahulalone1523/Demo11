package com.coreparts;

public class Demo {
	
	public static void getDetails() {
		System.out.println("Super Class Method!!!");
	}

}

class DriverDemo extends Demo{
	
	public static void getDetails() {
		
		System.out.println("Child Class Method!!!");
	}
	
	public static void main(String[] args) {
		
		//DriverDemo driverDemo = new DriverDemo();
		Demo.getDetails();
		
	}
}
