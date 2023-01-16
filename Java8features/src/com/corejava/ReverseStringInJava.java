package com.corejava;

public class ReverseStringInJava {
	public static void main(String[] args) {
	
		String s1="Hi i am Rahul";
	//	String noSpace=s1.replaceAll("\\s", "");
		char ch[]=s1.toCharArray();
		int length=ch.length;
		
		StringBuilder sb=new StringBuilder();
		
		for(int i=length-1;i>=0;i--) {
			sb.append(ch[i]);
			
			
		}
		System.out.println(sb.toString());
	}

 
	
	

}
