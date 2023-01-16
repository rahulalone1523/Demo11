package com.java8features;

import java.util.function.Function;

public class FunctionalChainingDemo {
	public static void main(String[] args) {
	
		Function<Integer,Integer> dubl = i->2*i;
		
		System.out.println("Square of no is :-> "+dubl.apply(5));
		
		Function<Integer,Integer> cubeic = i->i*i*i;
		
		System.out.println("Cube of no is :-> "+cubeic.apply(5));
		
		//first square it and then cube it
		System.out.println("Chaining using andThen() :->"+dubl.andThen(cubeic).apply(5));
		
		//first cube it and then square it
				System.out.println("Chaining using compose() :->"+dubl.compose(cubeic).apply(5));
				
	 }
	

	
}
