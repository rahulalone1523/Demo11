package com.java8features;

import java.util.function.Consumer;

public class Consumerdemo {

	public static void main(String[] args) {
	
		Consumer<Integer> square = i->System.out.println("it takes argument but returns nothing"+i*i);
		square.accept(5);
	}
	
}
