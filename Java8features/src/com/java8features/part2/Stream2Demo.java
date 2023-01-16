package com.java8features.part2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Stream2Demo {
	public static void main(String[] args) {
		
		List<Integer> list=Arrays.asList(5,4,9,85,7,6);
		List<Integer> sorted = list.stream().map(s->s*2).sorted((o1,o2)->o2-o1).collect(Collectors.toList());
		System.out.println("Sorted List : -> "+sorted);
	}

}
