package com.java8features;

import java.util.function.Predicate;

public class PredicatejoingDemo {
	
	public static void main(String[] args) {
		
		Predicate<String> firstString=s->s.length()>=5;
		System.out.println("Length of string is greater than 5 :->"+firstString.test("Thankyougod"));
		
		Predicate<String> secondString=s->s.length()%2==0;
		System.out.println("String length is Even :->"+secondString.test("Thankyougod"));
		
		System.out.println("Using And "+firstString.and(secondString).test("Thankyougod"));
		
		System.out.println("Using Or "+firstString.or(secondString).test("Thankyougod"));
		
		System.out.println("Using Negate "+firstString.negate().test("Thankyougod"));
		
	}

}
