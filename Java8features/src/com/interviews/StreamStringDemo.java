package com.interviews;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamStringDemo {
	public static void main(String[] args) {
	
		String str="Rahul is java java developer";
		String noSpace=str.replaceAll("\\s", "");
		Map<String,Long>map=Arrays.stream(noSpace.split(""))
				.map(String::toLowerCase)
				.collect(Collectors.groupingBy(x->x,LinkedHashMap::new,Collectors.counting()));
		System.out.println(map);
		List<String> asList = Arrays.asList("Rahulisjavadeveloper");
		List<String> collect = asList.stream().map(x->x.concat(x)
				).collect(Collectors.toList());
		
		System.out.println(collect);
	}
	
}
