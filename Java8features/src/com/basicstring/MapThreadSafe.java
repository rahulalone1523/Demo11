package com.basicstring;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class MapThreadSafe {
	public static void main(String[] args) {
		
		Map<String,Integer>map=new HashMap<>();
		map.put("Sunday", 1);
		map.put("Monday", 2);
		map.put("Tuesday", 3);
		map.put("Thursday", 4);
		System.out.println(map);
		Map<String,Integer>smap=Collections.synchronizedMap(map);
		System.out.println(smap);
	}

}
