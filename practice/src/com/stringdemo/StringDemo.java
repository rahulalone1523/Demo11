package com.stringdemo;

public class StringDemo {
	
	public static void main(String[] args) {
		
		String str1="Hello";
		String str2=new String("Hello");
		String str3="Hello World";
		
		System.out.println(str1==str2);//false
		System.out.println(str1.equals(str2));//true
		System.out.println("By intern methods :"+str1.intern().hashCode());
		System.out.println("By Normal methods :"+str1.hashCode());
		
		System.out.println("By intern methods :"+str2.intern().hashCode());
		System.out.println("By Normal methods :"+str2.hashCode());
		
		System.out.println(str1.intern().hashCode()==str3.hashCode());
	}

}
