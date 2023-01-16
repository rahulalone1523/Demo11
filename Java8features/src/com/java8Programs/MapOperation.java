package com.java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MapOperation {
	
	public static void main(String[] args) {
		
		List<Integer>list= Arrays.asList(1,2,3,4);
		List <Integer> newlist=list.stream().map(a->a*a).filter(x->x%2==0).collect(Collectors.toList());
		System.out.println(newlist);
		
		List<Integer>list1 = Arrays.asList(1,2,3,4,5,8,6,78,9,7,8,9,99);

		Map<Integer,Long>map=list1.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println("Map : "+map);
//		for(Map.Entry<Integer,Long> entry:map.entrySet()){
//		System.out.println(" Key:-"+entry.getKey()+" Value:-"+entry.getValue());
//		}
	}

}
