package interviewprograms;

import java.util.Arrays;

public class Annagram {
	
	static void isAnagram(String str1,String str2) {
		
		String s1=str1.replaceAll("\\s", "");
		String s2=str2.replaceAll("\\s", "");
		
		boolean temp=true;
		if (s1.length()!=s2.length()) {
			temp=false;
		}else {
			char[]arr1=s1.toUpperCase().toCharArray();
			char[]arr2=s2.toUpperCase().toCharArray();
			
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			
			temp=Arrays.equals(arr1, arr2);
			
			if(temp) {
				System.out.println(str1+" And "+str2+ " Both are Annagram!!!!!!");
			}else {
				System.out.println(str1+" And "+str2+ " Both are Not Annagram!!!!!!");
			}
		}
	}
	public static void main(String[] args) {
		isAnagram("TOP","PKT");
	}

}
