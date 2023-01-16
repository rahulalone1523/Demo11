package com.corej;

import java.util.Scanner;

public class Fabonacci {
	
	public static void main(String[] args) {
		int a=0,b=1,c=1;
		Scanner sc= new Scanner(System.in);
		System.out.println("Please enter no");
		int nextint=sc.nextInt();
		
		for(int i=0;i<nextint;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.println(a +" ");
			
		}
	}

}
