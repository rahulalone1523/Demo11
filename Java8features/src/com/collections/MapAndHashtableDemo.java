package com.collections;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class MapAndHashtableDemo {
	
	public static void main(String[] args) {
	
		Map<String ,Integer> table=new Hashtable<>();
		//Map<String ,Integer> table=new HashMap<>();
		table.put("null", 123);
		table.put("Prachitee", 132);
		table.put("Gauri", 113);
		table.put("Gaurav", 122);
		
//		System.out.println("Hashtable : -> "+table);
//		//iterating hashtable
//		
//		for(Map.Entry<String ,Integer>entry: table.entrySet()) {
//			System.out.println("Key : -> "+entry.getKey()+" Value : -> "+entry.getValue());
//			
//		}
		// using Enumeration
		 Enumeration<String> e = ((Hashtable<String, Integer>) table).keys();
		 
		
//		while(e.hasMoreElements()) {
//			String key=e.nextElement();
//			
//			System.out.println("Key : -> "+key+" Value : "+table.get(key));
//		}
		
//		table.forEach((key,value)->System.out.println("Keys :-> "+key+ " Values :-> "+value));
		 Iterator<Entry<String, Integer>> iterator = table.entrySet().iterator();
		 while(iterator.hasNext()) {
			 Entry<String, Integer> entry = iterator.next();
			 System.out.println(entry.getKey()+" "+entry.getValue());
		 }
	}
	
	

}
