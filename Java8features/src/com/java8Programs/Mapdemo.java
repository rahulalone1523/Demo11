package com.java8Programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Mapdemo {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(11, 23, 44, 76, 11, 23, 88, 95, 76, 11);
//		Set<Integer> set = new HashSet<>();
//		 Set<Integer>newList=list.stream().filter(a->!set.add(a)).collect(Collectors.toSet());
//		//list.stream().filter(x -> !set.add(x)).collect(Collectors.toSet()).forEach(a -> System.out.println(a));
//		 System.out.println(newList);

//		Map<Integer, Long> collect = list.stream()
//				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//
//		System.out.println(collect);
////
//		 list.stream().limit(2).forEach(a->System.out.println(a));
//		list.stream().skip(2).forEach(a -> System.out.println(a));
//
//		String str = "Rahul is java java java developer";
//		List<String> list1 = Arrays.asList(str.split(" "));
//
//		Map<String, Long> collct = list1.stream()
//				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//		System.out.println(collct);
//		
		int maxno=list.stream().max(Comparator.comparing(Integer::valueOf)).get();
		System.out.println("Max no:"+maxno);
//		
//		Optional<Integer> minno=list.stream().min(Comparator.comparing(Integer::valueOf));
//		System.out.println("Min no:"+minno);

	}

}
