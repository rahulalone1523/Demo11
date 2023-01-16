package com.interviews;

import java.util.HashMap;
import java.util.Map;

public class Student {

	//static void charCount(String str) {

	public static void main(String[] args) {
		
		Map<Character, Integer> map1 = new HashMap<>();
		String str="Rahul is java developer";
		String noSpaceStr = str.replaceAll("\\s", "");
		char[] strArray = noSpaceStr.toCharArray();

		for (char c : strArray) {
			if (map1.containsKey(c)) {
				map1.put(c, map1.get(c) + 1);
			} else {
				map1.put(c, 1);
			}
		}
		for(Map.Entry<Character, Integer> entry:map1.entrySet()) {
			System.out.print(entry.getKey() + "-" + entry.getValue()  + "," );
		}

	}

}
