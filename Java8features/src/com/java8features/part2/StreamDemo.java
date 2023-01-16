package com.java8features.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
	public static void main(String[] args) {
		//List<Integer> list= new ArrayList<>();

		Set<Integer> set=new HashSet<>();
		
		List<Integer> asList = Arrays.asList(1,2,3,5,6,4,5,2,7,7,8);
		
		Set<Integer> collect = asList.stream().filter(s->!set.add(s)).collect(Collectors.toSet());
		System.out.println("Elements : -> "+collect);
		
		List<Integer> afterAdd = asList.stream().map(s->s+2).collect(Collectors.toList());
		System.out.println("After addng 2 to each elements of stream :-> "+afterAdd);
		
		Set<Integer>newstream = asList.stream().filter(s->!set.add(s)).filter(a->a%2==0).peek(i->System.out.println(i)).collect(Collectors.toSet());
		System.out.println("After addng 2 to each elements of stream :-> "+newstream);
		
	  List<Integer> collect2 = asList.stream().distinct().collect(Collectors.toList());
	  System.out.println("    "+collect2);
	}
	
	
}
