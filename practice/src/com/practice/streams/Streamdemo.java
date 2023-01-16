package com.practice.streams;

import java.util.Arrays;
import java.util.stream.Stream;

public class Streamdemo {
	public static void main(String[] args) {
		
		int[] profit= {4000,5000,8000,15000,2000,1000};
		
		double reduce = Arrays.stream(profit).filter(x->x>5000).mapToDouble(x->x*0.25).reduce(0, (a,b)->a+b);
		System.out.println("taxable Amount :"+reduce);
		
		String[] str= {"Hi","Iam","Java","Developer","By","Profession"};
		String NewString=Stream.of(str).map(x->x.toUpperCase()).reduce("", (a,b)->a+b);
		System.out.println("New String becomes :"+NewString);
	}

}
