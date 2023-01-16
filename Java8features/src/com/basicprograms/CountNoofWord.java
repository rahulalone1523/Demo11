package com.basicprograms;

import java.text.CharacterIterator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountNoofWord{

public static void main(String[] args){

Scanner sc=new Scanner(System.in);
System.out.println("Please enter string here!!!!");
String str=sc.nextLine();
Map<Character ,Integer> map = new HashMap<>();
String strSplit = str.replaceAll(" ","");
char[] charArray = strSplit.toCharArray();
for(int i=0;i<charArray.length;i++){

	if(map.containsKey(charArray[i])){
	
	map.put(charArray[i] ,map.get(charArray[i])+1 );
	
	}else{
	
	map.put(charArray[i] ,1 );
	}
}
	System.out.println(map);
	for(Map.Entry<Character,Integer> entry :map.entrySet()){
	System.out.println("Key : "+entry.getKey()+" Value :"+entry.getValue());

}
	
}

}