package com.corejava;

public class DerivedClass extends BaseClass{
	
	public static void getData() {
		System.out.println("This is getData method from DerivedClass class");
	}
	
	public static void main(String[] args) {
		DerivedClass obj=new DerivedClass();
		obj.getData();
		
		BaseClass obj1=new BaseClass();
		obj1.getData();
		
		BaseClass obj2=new DerivedClass();
		obj2.getData();
	}

}
