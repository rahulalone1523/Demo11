package com.basicprograms;

public class ComparingNos {
	
	static void comparing(int a,int b,int c) {
		if(a>=b && a>=c) {
			System.out.println("A is biggest numbers A="+a);
		}else if(b>=a && b>=c) {
			System.out.println("B is biggest numbers B="+b);
		}
		else if(c>=a && c>=b) {
			System.out.println("C is biggest numbers C="+c);
		}
	}
	
	public static void main(String[] args) {
		comparing(26,99,90);
	}

}
