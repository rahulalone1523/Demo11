package com.basicstring;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class CharactorRepeating {
	
	public static void main(String[] args) {
		String str="Rahul is working on java";
		String replaceAll = str.replaceAll("\\s", "");
		System.out.println(replaceAll);
		char []ch=replaceAll.toCharArray();
		
		Map<Character,Integer>map=new HashMap<>();
		for(int i=0;i<ch.length;i++) {
			
			if(map.containsKey(ch[i])) {
				map.put(ch[i],map.get(ch[i])+1 );
				
			}else {
				map.put(ch[i], 1);
			}
			
			
		}
		
		System.out.println(map);
		for(Map.Entry<Character,Integer> entry:map.entrySet()) {
			System.out.println("Character :- "+entry.getKey()+ " Appearance Count : "+entry.getValue());
			
		}
		
		Iterator<Entry<Character, Integer>> itr=map.entrySet().iterator();
		while(itr.hasNext()) {
			Entry<Character, Integer> entry1 = itr.next();
			System.out.println(entry1);
		}
	}
	

}
