package interviewprograms;

import java.util.Scanner;

public class Palidrom {

	public static void main(String[] args) {
		String reverse = "";
		System.out.println("Please Enter String or no");
		Scanner sc = new Scanner(System.in);
		String Original = sc.nextLine();
		int length = Original.length();

		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + Original.charAt(i);
		}
		System.out.println("Reverse String : " + reverse);
		// sc.close();

		if (Original.equals(reverse)) {
			System.out.println("The no is palidrom");

		} else {
			System.out.println("The no is not palidrom");
		}
		 sc.close();

	}

}
