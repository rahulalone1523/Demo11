package com.progrmmimg;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String str = "java is programmimg language";
		String replaceAll = str.replaceAll(" ", "");
		char[] charArray = replaceAll.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (char c : charArray) {
			if (!map.containsKey(c)) {
				map.put(c, 1);
			} else {
				map.put(c, map.get(c) + 1);
			}
		}
		System.out.println(map);
		//map.forEach((k,v)->System.out.println("Key = "+k + " Value = "+v));
		for(Map.Entry<Character, Integer> entry:map.entrySet()) {
			if(entry.getValue() > 1) {
				System.out.println("Key = "+entry.getKey()+ " Value = "+entry.getValue());
				
			}
		}

		

	}

}
