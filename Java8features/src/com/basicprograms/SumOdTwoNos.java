package com.basicprograms;

public class SumOdTwoNos {
	
	static void sum(int a,int b) {
		int sum;
		sum=a+b;
		System.out.println("Sum of two digits are : "+sum);
	}
	public static void main(String[] args) {
		sum(25,97);
		int newSum = 0;
		for(int i=0;i<=10;i++) {
			newSum=newSum+i;
		}
		System.out.println("Final addition : "+newSum);
	}

}
