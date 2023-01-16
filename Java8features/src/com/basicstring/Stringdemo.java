package com.basicstring;

public class Stringdemo {
	public static void main(String[] args) {
		String s1="ABC";
		String s2=new String("ABC");
		//String s2=new String(s1);
		String s3=s1+s2;
		
		System.out.println("String S1 : "+s1);
		System.out.println("String S2 : "+s2);
		System.out.println("String S3 : "+s3);
		
		StringBuffer sb=new StringBuffer(s1);
		sb.append("PQR");
		System.out.println(sb.toString());
	}
	
	
	

}
