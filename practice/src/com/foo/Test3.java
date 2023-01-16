package com.foo;

public class Test3 {
	public static void main(String[] args) {
		String sentence="Rahul 12 gauri 32";
	      //String s= sentence.replaceAll("[A-Za-z]","");
		 String s= sentence.replaceAll("[0-9]","");
		 
	     String  i=sentence.replaceAll("[A-Za-z]","");
	     int asd=Integer.valueOf(i);
	     String d = sentence.replaceAll("[A-Za-z0-9]","");
	        //double d=Double.parseDouble(sentence.replaceAll("[^A-Za-z0-9]",""));
	        System.out.println("string "+s);
	        System.out.println("integer parseInt "+asd);
	        System.out.println("double "+d+" ");
	}

}

