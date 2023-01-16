package com.foo;

import java.util.HashSet;

public class LongestSubstringWithoutRepeatation {
	public static void main(String[] args) {
		String str="abcdab";
		System.out.println(longestSubstring(str));
	}

	private static String longestSubstring(String str) {
		HashSet<Character> ch = new HashSet<>();
		String longestTillNow = "";
		String longestOverAll="";
		
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if(ch.contains(c)) {
				longestTillNow="";
				ch.clear();
			}
			longestTillNow+=c;
			ch.add(c);
		}
		if(longestTillNow.length() > longestOverAll.length()) {
			longestOverAll=longestTillNow;
		}
		return longestOverAll;
	}
	

}
