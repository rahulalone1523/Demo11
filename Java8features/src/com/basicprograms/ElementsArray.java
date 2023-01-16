package com.basicprograms;

import java.util.ArrayList;
import java.util.Scanner;

public class ElementsArray {
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter no to be added in ArrayList");
		int count=sc.nextInt();
		sc.close();
		ArrayList<Integer> al=new ArrayList<>();
		for(int i=0;i<count;i++) {
			al.add(i);
		}
		System.out.println("ArrayList Elements : "+al);
		
		al.remove(5);
		
		System.out.println("After removing one element,ArrayList Elements : "+al);
		
		ArrayList<Integer>even=new ArrayList<>();
		ArrayList<Integer>odd=new ArrayList<>();
		
		for(int i=0;i<=al.size()-1;i++) {
			//System.out.print(al.get(i)+" ");
			if(al.get(i)%2==0) {
				
				even.add(al.get(i));
				//System.out.print("Even Elements : "+al.get(i)+" ");
			}else {
				odd.add(al.get(i));
				//System.out.print("Odd Elements : "+al.get(i)+" ");
			}
			
			
		}
		System.out.println("Even Elements : "+even+" ");
		System.out.print("Odd Elements : "+odd+" ");
	}

}
