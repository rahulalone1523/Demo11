package com.java8Programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Interview {
	public static void main(String[] args) {
		int arr[]= {14,12,15,11,87,11};
		List<Integer>list=Arrays.asList(14,12,15,11,87,11);
		
		String str="I am am Java Java developer";
		
		Map<String, Long> output = Stream.of(str.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		//List<Integer> output = list.stream().filter(x->x%2==0).map(a->a*a).collect(Collectors.toList());
		System.out.println(output);
		
		Arrays.stream(arr).filter(x->x%2==0).map(a->a*a).forEach(a->System.out.println(a));
		//map.forEach(a->System.out.println(a));
	}
	
	

}
