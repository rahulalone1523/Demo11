package com.java8features.part3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatmapDemo1 {
	
	public static void main(String[] args) {
		
		 List<User> newList = Stream.of(
				new User("1","123453",Arrays.asList("alonerahul23@gmail.com","gauri@gmail.com")),
				new User("2","8376556856",Arrays.asList("gaurav@gmail.com","prachi@gmail.com"))
			).collect(Collectors.toList());
		 
		 List<List<String>> newlist1 = newList.stream().map(User::getEmail).collect(Collectors.toList());
		System.out.println(newlist1);
		List<String> collect = newlist1.stream().flatMap(x->x.stream()).collect(Collectors.toList());
		System.out.println(collect);
	}

}
