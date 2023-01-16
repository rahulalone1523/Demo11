package interviewprograms;

public class ReverseWithoutUsingStringMethods {
	
	public static void main(String[] args) {
		
//		String str="India is my Country";
//		StringBuilder sb=new StringBuilder();
//		sb.append(str);
//		sb=sb.reverse();
//		System.out.println("Reverse String :->"+sb);
		
		String s1="India is my Country";
		//char ch[]=s1.toCharArray();
		String[] split = s1.split("");
		int length=split.length;
		StringBuilder sb=new StringBuilder();
		for(int i=length-1;i>=0;i--) {
			sb.append(split[i]+" ");
			//System.out.println(" ");
			
		}
		//System.out.println(" ");
		System.out.println(sb.toString());
	}

}
