package com.java8features.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Listdemo {
	
	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(11,12,13,14,77,55,66);
		List<Integer> list3 = Arrays.asList(1,7,8,6,9,5);
		
		List<Integer>list2=new ArrayList<>();
		
		list2.addAll(list1);
		list2.addAll(list3);
		System.out.println("List 1 : -> "+list2.toString());
		
	}

}
