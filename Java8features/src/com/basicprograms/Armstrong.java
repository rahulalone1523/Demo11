package com.basicprograms;

import java.util.Scanner;

public class Armstrong {

	static void threeDigit(int temp1) {
		int a = 0, b, temp;

		temp = temp1;

		while (temp1 > 0) {
			b = temp1 % 10;
			temp1 = temp1 / 10;

			a = a + (b * b * b);
		}
		if (temp == a) {
			System.out.println("Entered no is ArmStrong!!");

		} else {
			System.out.println("Entered no is NOT ArmStrong!!");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter no ");
		int input = sc.nextInt();
		int temp1 = input;
		int count = 0;
		while (input != 0) {
			input = input / 10;
			count++;
		}
		System.out.println("input digits : " + count);
		System.out.println("input digits : " + temp1);

		if (count > 3) {
			fourDigitNo(temp1);
		} else {
			threeDigit(temp1);
		}
		sc.close();
	}

	static void fourDigitNo(int temp1) {

		int a = 0, b, temp;

		temp = temp1;

		while (temp1 > 0) {
			b = temp1 % 10;
			temp1 = temp1 / 10;

			a = a + (b * b * b * b);
		}
		if (temp == a) {
			System.out.println("Entered no is ArmStrong!!");

		} else {
			System.out.println("Entered no is NOT ArmStrong!!");
		}

	}

}
