package com.functionalinterface;

public class Myclass implements MyInterface{

	@Override
	public void getData() {
		System.out.println("Abstract method overrides only !!!!!!!");
		
	}
	
	public static void main(String[] args) {
		Myclass obj=new Myclass();
		obj.getData();
	}

}
