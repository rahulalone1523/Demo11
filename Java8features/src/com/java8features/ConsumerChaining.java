package com.java8features;

import java.util.function.Consumer;

public class ConsumerChaining {
	
	public static void main(String[] args) {
		
		Consumer<Integer> dobl=j-> System.out.println("Double the no :->"+j*2);
		//dobl.accept(10);
		
		Consumer<Integer>triple=k->System.out.println("Triple the no :->"+k*3);
		//triple.accept(10);
		
		
		
		dobl.andThen(triple).accept(5);
		
	}

}
