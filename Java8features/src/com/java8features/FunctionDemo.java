package com.java8features;

import java.util.function.Function;

public class FunctionDemo {
	
	public static void main(String[] args) {
		//first integer is input parameter
		//second integer is output parameter
		Function<Integer,Integer> square = i->i*i;
		
		System.out.println("Square of no is :-> "+square.apply(4));
		
	}

}
