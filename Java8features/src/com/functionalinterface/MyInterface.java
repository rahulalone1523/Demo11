package com.functionalinterface;

public interface MyInterface {
	
	void getData();      //abstract method

	default void getStudent() {
		System.out.println("This is Default getStudent methods!!!!!!");
	}
	
	static void getdetails() {
		System.out.println("This is static methods");
	}
}
