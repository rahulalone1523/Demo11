package com.java8features;

import java.util.function.Predicate;

public class PredicateDemo {
	
	
	public static void main(String[] args) {
		
		Predicate<String> pString=s->s.length()>=5;
		System.out.println("Length of string is greater than 5 :-> "+pString.test("Hello"));
	}
		
	

}
