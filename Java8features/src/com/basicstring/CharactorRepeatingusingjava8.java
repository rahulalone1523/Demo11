package com.basicstring;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CharactorRepeatingusingjava8 {

	public static void main(String[] args) {

		String str = "Rahul is java developer";
		String newString = str.replaceAll("\\s", "");
		List<String> list = Arrays.asList(newString);
		System.out.println("List : " + list);

		LinkedHashMap<String, Long> linkedHashMap = Arrays.stream(newString.split("")).map(String::toLowerCase)
				.collect(Collectors.groupingBy(s -> s, LinkedHashMap::new, Collectors.counting()));
		System.out.println(linkedHashMap.toString());
		List<Integer> collect = Stream.of(2, 2, 5, 6).collect(Collectors.toList());
		System.out.println(collect);
		
		List<Integer> list1= Stream.of(23,11,55,22,33,15,88).sorted().collect(Collectors.toList());
		System.out.println(list1);
		Stream.of(newString).map(String ::toUpperCase).forEach(System.out::println);
	}

}
