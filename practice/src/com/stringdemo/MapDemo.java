package com.stringdemo;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
	
	public static void main(String[] args) {
		
		
		String str="india is my country";
		String strTrim = str.replaceAll(" ","");
		char[] strChar= strTrim.toCharArray();
		
		Map<Character,Integer> map= new HashMap<>();
		
		for(int i=0;i<strChar.length;i++) {
			if(map.containsKey(strChar[i])) {
				map.put(strChar[i],map.get(strChar[i])+1);
				
			}else {
				map.put(strChar[i],1);
			}
		}
		System.out.println(map);
		
		for(Map.Entry<Character, Integer> entry :map.entrySet()) {
			System.out.println("Key : "+entry.getKey()+ " Value : "+entry.getValue());
		}
	}

}
