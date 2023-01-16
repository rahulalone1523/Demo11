package com.java8features.part2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapDemo {
	public static void main(String[] args) {
	
		List<List<Integer>>list=new ArrayList<>();
		//list.add("Rahul");
		
		List<String>list1=Arrays.asList("Rahul","Sandy","Gauri");
		List<Integer> newlist=list1.stream().map(x->x.length()).collect(Collectors.toList());
		System.out.println(newlist);
		
		list.add(Arrays.asList(2,3));
		list.add(Arrays.asList(5,7));
		list.add(Arrays.asList(1,1));
		list.add(Arrays.asList(8,6));
		
		System.out.println("Before flat map : -> "+list);
		
		List<Integer>newwlist=list.stream().flatMap(list2->list2.stream()).collect(Collectors.toList());
		System.out.println("After flat map : -> "+newwlist);
	}
	

}
