package interviewprograms;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		int a=0,b=1,c=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no : ");
		int nextInt = sc.nextInt();
		
		System.out.println("Fibonacci series is : ");
		for (int i=0;i<nextInt;i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.println(a + "");
		}
	}

}
