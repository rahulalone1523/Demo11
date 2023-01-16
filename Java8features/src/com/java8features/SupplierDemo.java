package com.java8features;

import java.util.Date;
import java.util.function.Supplier;

public class SupplierDemo {
	public static void main(String[] args) {
		Supplier<Date> date=()->new Date();
		
		System.out.println("Current date is "+date.get());
	}
	
    // as there in no input so supplier does have chaining
	
	
	
}
