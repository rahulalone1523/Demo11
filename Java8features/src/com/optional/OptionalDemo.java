package com.optional;

import java.util.Optional;

public class OptionalDemo {
	
	public static void main(String[] args) {
		String str=null;
		
		if(str.equalsIgnoreCase("Rahul")) {
			System.out.println("String matched!!!");
		}else {
			Optional<String> newString=Optional.ofNullable(str);
			System.out.println(newString.get());
		}
		
	}

}
