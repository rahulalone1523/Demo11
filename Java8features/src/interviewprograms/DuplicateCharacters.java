package interviewprograms;

public class DuplicateCharacters {

	public static void main(String[] args) {
		
		String str=new String("I am Rahul Rahul developer");
		char[]ch=str.toCharArray();
		int count=0;
		System.out.println("Dupluicate elements are : ");
		
		for(int i=0;i<=str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				
				if(ch[i]==ch[j]) {
					System.out.print(ch[j]);
					count++;
					break;
				}
			}
		}
	}

}
