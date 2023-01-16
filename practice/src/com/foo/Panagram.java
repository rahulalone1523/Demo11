package com.foo;

public class Panagram {
	public static void main(String[] args) {
		
		//String str="The quick brown fox jumps over the lazy dog";
		String str="Hello World";
		
		System.out.println(panagram(str));
	}

	private static boolean panagram(String str) {
		if(str.length()<26) {
			return false;
		}else {
			for(char ch='a';ch<='z';ch++) {
				if(str.indexOf(ch)<0) {
					return false;
				}
			}
			return true;
		}
		
	}
}
