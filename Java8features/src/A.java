import java.util.Scanner;

public class A {
	
	public static void main(String[] args) {
		int a=0,b=1,c=1;
		System.out.println("Please enter no :-");
		Scanner sc=new Scanner(System.in);
		int input =sc.nextInt();
		for(int i=0;i<input;i++){
		a=b;
		b=c;
		c=a+b;
		System.out.println(a);
		}
		}
		

}
